package epam.course.tests;

import epam.course.InitTests;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Title;

import static com.epam.jdi.uitests.core.preconditions.PreconditionsState.isInState;
import static com.epam.web.matcher.testng.Assert.assertTrue;
import static epam.course.JDISite.*;
import static epam.course.enums.Preconditions.LOGGED_IN;

/**
 * Created by Rita on 21.11.2016.
 */
@Title("Test paginator")
public class NavigationTest extends InitTests {

    @BeforeClass
    public void before() {
        isInState(LOGGED_IN);
        supportPage.isOpened();
    }

    @Title("Open previous page for Support Page")
    @Test(priority = 1)
    public void prevTest() {
        pageNavigator.previous();
        contactPage.checkOpened();
    }

    @Title("Open next page for Contact Page")
    @Test(priority = 2)
    public void nextTest() {
        pageNavigator.next();
        supportPage.checkOpened();
    }

    @Title("Open first page")
    @Test(priority = 3)
    public void firstTest() {
        pageNavigator.first();
        contactPage.checkOpened();
    }

    @Title("Check that 'prev' button is disabled after first page ")
    @Test(priority = 4)
    public void prevAfterFirstTest() {
        assertTrue(contactPage.getDriver().findElement(By.cssSelector(".prev")).getAttribute("class").contains("disable"));
    }

    @Title("Open last page")
    @Test(priority = 5)
    public void lastTest() {
        pageNavigator.last();
        metalsAndColorsPage.checkOpened();
    }

    @Title("Check that 'next' button is disabled after last page")
    @Test(priority = 6)
    public void nextAfterLastTest() {
        assertTrue(metalsAndColorsPage.getDriver().findElement(By.cssSelector(".next")).getAttribute("class").contains("disable"));
    }
}
