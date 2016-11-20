package epam.course.dataproviders;

import epam.course.entities.User;
import org.testng.annotations.DataProvider;

/**
 * Created by Rita on 16.11.2016.
 */
public class LoginDP {

    @DataProvider(name = "login")
    public static Object[][] loginData() {
        return new Object[][]{
                {new User(false, "", "")},
                {new User(false, "epam", "")},
                {new User(false, "", "1234")},
                {new User(false, "user", "password")},
                {new User(true, "epam", "1234")}
        };
    }
}
