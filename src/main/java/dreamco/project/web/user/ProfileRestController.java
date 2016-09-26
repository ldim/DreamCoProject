package dreamco.project.web.user;


import dreamco.project.AuthorizedUser;
import dreamco.project.model.User;

/**
 * User: Artyom
 * Date: 19.09.2016
 */
public class ProfileRestController extends AbstractUserController {

    public User get() {
        return super.get(AuthorizedUser.id());
    }

    public void delete() {
        super.delete(AuthorizedUser.id());
    }

    public void update(User user) {
        super.update(user, AuthorizedUser.id());
    }
}