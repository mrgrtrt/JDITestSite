package epam.course.tests;

import epam.course.InitTests;
import epam.course.dataproviders.LoginDP;
import epam.course.entities.User;
import org.testng.annotations.*;

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
    public void login(User user) {
        homePage.refresh();
        login.submit(user);
        login.validate(user);
    }

}
