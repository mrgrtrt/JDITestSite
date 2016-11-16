package epam.course.tests;

import epam.course.InitTests;
import epam.course.enums.MetalsRadio;
import epam.course.objects.User;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static epam.course.JDISite.differentElementPage;
import static epam.course.JDISite.homePage;
import static epam.course.JDISite.login;

/**
 * Created by Rita on 16.11.2016.
 */
public class RadioTest extends InitTests {

    @BeforeTest
    public void before() {
        homePage.isOpened();
        login.submit(new User("epam", "1234"));
        differentElementPage.open();
    }

    @Test
    public void radioButtonsTest() {
        differentElementPage.metalsRadio.select(1);
        differentElementPage.metalsRadio.select("Silver");
        differentElementPage.metalsRadio.select(MetalsRadio.BRONZE);
        differentElementPage.metalsRadio.setValue("Selen");
    }

}
