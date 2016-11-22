package epam.course.tests;

import epam.course.InitTests;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.epam.jdi.uitests.core.preconditions.PreconditionsState.isInState;
import static epam.course.JDISite.*;
import static epam.course.enums.Preconditions.LOGGED_IN;

/**
 * Created by Rita on 21.11.2016.
 */
public class NavigationTest extends InitTests {

    @BeforeTest
    public void before() {
        isInState(LOGGED_IN);
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
