package dreamco.project.web;

import dreamco.project.AuthorizedUser;
import dreamco.project.model.Desire;
import dreamco.project.repository.DesireRepository;
import dreamco.project.repository.mock.InMemoryDesireRepositoryImpl;
import dreamco.project.util.DesireUtil;
import org.slf4j.Logger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Objects;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * Created by Artyom on 23.09.2016.
 */
public class UserServlet extends HttpServlet {
    private static final Logger LOG = getLogger(UserServlet.class);

    private DesireRepository repository;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        repository = new InMemoryDesireRepositoryImpl();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String id = request.getParameter("id");

        Desire desire = new Desire(id.isEmpty() ? null : Integer.valueOf(id),
                LocalDateTime.parse(request.getParameter("dateTime")),
                request.getParameter("description"),
                request.getParameter("barter"));

        LOG.info(desire.isNew() ? "Create {}" : "Update {}", desire);
        //repository.save(desire);
        repository.save(desire, AuthorizedUser.id());
        response.sendRedirect("desires");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if(action == null){
            LOG.info("getAll");
            request.setAttribute("desireList",
                    DesireUtil.getBARTERwithCollections(repository.getAll(AuthorizedUser.id()), DesireUtil.DEFAULT_BARTER));
            request.getRequestDispatcher("/desireList.jsp").forward(request, response);
        } else if("delete".equals(action)){
            int id = getId(request);
            LOG.info("Delete {}", id);
            repository.delete(id, AuthorizedUser.id());
            response.sendRedirect("desires");
        } else if("create".equals(action) || "update".equals(action)){
            final Desire desire = action.equals("create") ?
                    new Desire(LocalDateTime.now().withNano(0).withSecond(0), "", "") :
                    repository.get(getId(request), AuthorizedUser.id());
            request.setAttribute("desire", desire);
            request.getRequestDispatcher("/desireEdit.jsp").forward(request, response);
        }

//        request.setAttribute("desireList", DesireUtil.getBARTER());
//        request.getRequestDispatcher("/desireList.jsp").forward(request, response);
        //response.sendRedirect("desireList.jsp");
    }


    private int getId(HttpServletRequest request) {
        String paramId = Objects.requireNonNull(request.getParameter("id"));
        return Integer.valueOf(paramId);
    }
}
