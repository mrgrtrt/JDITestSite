package epam.course.dataproviders;

import org.testng.annotations.DataProvider;

/**
 * Created by Rita on 16.11.2016.
 */
public class LoginDP {

    @DataProvider(name = "login")
    public static Object[][] loginData() {
        return new Object[][]{
                {false, "", ""},
                {false, "epam", ""},
                {false, "", "1234"},
                {false, "user", "password"},
                {true, "epam", "1234"}
        };
    }
}
