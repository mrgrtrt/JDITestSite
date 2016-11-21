package epam.course.tests;

import epam.course.InitTests;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static epam.course.JDISite.pageNavigator;
import static epam.course.JDISite.supportPage;

/**
 * Created by Rita on 21.11.2016.
 */
public class NavigationTest extends InitTests {

    @BeforeMethod
    public void before() {
        supportPage.isOpened();
    }

    @Test
    public void prevTest() {
        pageNavigator.previous();
    }

    @Test
    public void nextTest() {
        pageNavigator.next();
    }

    @Test
    public void firsTest() {
        pageNavigator.first();
    }

    @Test
    public void prevAfterFirstTest() {
        pageNavigator.previous();
    }

    @Test
    public void lastTest() {
        pageNavigator.last();
    }

    @Test
    public void nextAfterLastTest() {
        pageNavigator.next();
    }
}
