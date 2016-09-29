package dreamco.project;


import dreamco.project.util.DesireUtil;

/**
 * User: Artyom
 * Date: 19.09.2016
 */
public class AuthorizedUser {

    public static int id = 1;

    public static int id() {
        return id;
    }

    public static void setId(int id) {
        AuthorizedUser.id = id;
    }

    public static int getBarterPerReg() {
        return DesireUtil.DEFAULT_BARTER;
    }
}
