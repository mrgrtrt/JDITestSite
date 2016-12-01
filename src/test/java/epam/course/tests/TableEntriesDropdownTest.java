package epam.course.tests;

import epam.course.InitTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Title;

import static com.epam.jdi.uitests.core.preconditions.PreconditionsState.isInState;
import static com.epam.web.matcher.testng.Assert.assertEquals;
import static epam.course.JDISite.dynamicTablePage;
import static epam.course.enums.Preconditions.LOGGED_IN;

/**
 * Created by Rita on 28.11.2016.
 */
@Title("Test dropdown for entries on the table on 'Table with Pages'")
public class TableEntriesDropdownTest extends InitTests {

    @BeforeClass
    public void before() {
        isInState(LOGGED_IN);
        dynamicTablePage.isOpened();
    }

    @Title("Select 5 entries and check that there are 5 rows")
    @Test
    public void tableFiveEntries() {
        dynamicTablePage.entries.select("5");
        assertEquals(dynamicTablePage.table.rows().count(), 5);
    }

    @Title("Select 10 entries and check that there are 10 rows")
    @Test
    public void tableTenEntries() {
        dynamicTablePage.entries.select("10");
        assertEquals(dynamicTablePage.table.rows().count(), 10);
    }

    @Title("Select 15 entries and check that there is right entries information message")
    @Test
    public void tableFifteenEntries() {
        dynamicTablePage.entries.select("15");
        assertEquals(dynamicTablePage.entriesInfo.getText(), "Showing 1 to 11 of 11 entries");
    }

    @Title("Select 20 entries and check that there is right entries information message")
    @Test
    public void tableTwentyEntries() {
        dynamicTablePage.entries.select("20");
        assertEquals(dynamicTablePage.entriesInfo.getText(), "Showing 1 to 11 of 11 entries");
    }

}
