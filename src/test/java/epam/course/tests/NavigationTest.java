package epam.course.tests;

import epam.course.InitTests;
import epam.course.entities.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static epam.course.JDISite.*;

/**
 * Created by Rita on 21.11.2016.
 */
public class NavigationTest extends InitTests {

    @BeforeTest
    public void before() {
        //homePage.isOpened();
        //login.submit(new User(true, "epam", "1234"));
        supportPage.isOpened();
    }

    @Test(priority = 1)
    public void prevTest() {
        pageNavigator.previous();
        contactPage.checkOpened();
    }

    @Test(priority = 2)
    public void nextTest() {
        pageNavigator.next();
        supportPage.checkOpened();
    }

    @Test(priority = 3)
    public void firstTest() {
        pageNavigator.first();
        contactPage.checkOpened();
    }

    @Test(priority = 4)
    public void prevAfterFirstTest() {
        try {
            pageNavigator.previous();
        } catch (Exception e) {
            contactPage.checkOpened();
        }
    }

    @Test(priority = 5)
    public void lastTest() {
        pageNavigator.last();
        metalsAndColorsPage.checkOpened();
    }

    @Test(priority = 6)
    public void nextAfterLastTest() {
        try {
            pageNavigator.next();
        } catch (Exception e) {
            metalsAndColorsPage.checkOpened();
        }
    }
}
