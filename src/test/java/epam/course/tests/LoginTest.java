package epam.course.tests;

import epam.course.InitTests;
import epam.course.dataproviders.LoginDP;
import epam.course.entities.User;
import org.testng.annotations.*;

import static com.epam.jdi.uitests.core.preconditions.PreconditionsState.isInState;
import static epam.course.JDISite.homePage;
import static epam.course.JDISite.login;
import static epam.course.enums.Preconditions.LOGGED_OUT;

/**
 * Created by Rita on 16.11.2016.
 */
public class LoginTest extends InitTests {

    @BeforeTest
    public void before() {
        homePage.isOpened();
        isInState(LOGGED_OUT);
    }

    @Test(dataProviderClass = LoginDP.class, dataProvider = "login")
    public void login(User user) {
        homePage.refresh();
        login.submit(user);
        login.validate(user);
    }

}
