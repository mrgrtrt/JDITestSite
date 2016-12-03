package epam.course.entities;

/**
 * Created by Rita on 16.11.2016.
 */
public class User {

    private String login;
    private String password;
    public boolean isExists;

    public User(boolean isExists, String login, String password) {
        this.login = login;
        this.password = password;
        this.isExists = isExists;
    }

    @Override
    public String toString() {
        return ("User(" + login + ',' + password + ")");
    }
}
