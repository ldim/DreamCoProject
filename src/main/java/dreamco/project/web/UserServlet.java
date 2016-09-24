package dreamco.project.web;

import dreamco.project.util.UserDesireUtil;
import org.slf4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * Created by Artyom on 23.09.2016.
 */
public class UserServlet extends HttpServlet {
    private static final Logger LOG = getLogger(UserServlet.class);
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOG.debug("redirect to userList");
        request.setAttribute("userList", UserDesireUtil.getBARTER());
        request.getRequestDispatcher("/userList.jsp").forward(request, response);
        //response.sendRedirect("userList.jsp");
    }
}
