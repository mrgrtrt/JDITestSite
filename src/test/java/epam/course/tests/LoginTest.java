package epam.course.tests;

import epam.course.InitTests;
import epam.course.dataproviders.LoginDP;
import epam.course.objects.User;
import org.testng.annotations.*;

import java.io.IOException;
import java.lang.reflect.Method;

import static epam.course.JDISite.homePage;
import static epam.course.JDISite.login;

/**
 * Created by Rita on 16.11.2016.
 */
public class LoginTest extends InitTests {

    @BeforeMethod
    public void before() {
        homePage.isOpened();
    }

    @Test(dataProviderClass = LoginDP.class, dataProvider = "login")
    public void login(boolean userExists, String username, String password) {
        homePage.refresh();
        login.submit(new User(username, password));
        login.validate(userExists);
    }

}
