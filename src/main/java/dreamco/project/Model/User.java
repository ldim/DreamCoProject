package dreamco.project.model;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Artyom on 20.09.2016.
 */
public class User {
    private AtomicInteger userId;
    private int userPassword;
    private String userEmail;

    public User(AtomicInteger userId, int userPassword, String userEmail) {
        this.userId = userId;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
    }

    public AtomicInteger getUserId() {
        return userId;
    }

    public int getUserPassword() {
        return userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserId(AtomicInteger userId) {
        this.userId = userId;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setUserPassword(int userPassword) {
        this.userPassword = userPassword;
    }
}
