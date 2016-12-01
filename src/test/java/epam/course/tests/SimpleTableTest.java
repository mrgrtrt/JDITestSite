package epam.course.tests;

import epam.course.InitTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Title;

import static com.epam.jdi.uitests.core.preconditions.PreconditionsState.isInState;
import static com.epam.web.matcher.testng.Assert.assertContains;
import static com.epam.web.matcher.testng.Assert.assertEquals;
import static com.epam.web.matcher.testng.Assert.assertTrue;
import static epam.course.JDISite.actionsLog;
import static epam.course.JDISite.simpleTablePage;
import static epam.course.enums.Preconditions.LOGGED_IN;

/**
 * Created by Rita on 27.11.2016.
 */
public class SimpleTableTest extends InitTests {

    @BeforeClass
    public void before() {
        isInState(LOGGED_IN);
        simpleTablePage.isOpened();
    }

    @Title("Test table on 'Simple Table Page'")
    @Test
    public void simpleTable() {
        simpleTablePage.simpleTable.cell(2, 6).click();
        assertContains(actionsLog.getFirstText(), "value=Custom; cell has been selected");
        //simpleTablePage.simpleTable.cell(3, 3).select();
        //assertContains(actionsLog.getFirstText(), "value=MSTest, NUnit, Epam; cell has been selected");
    }

}
