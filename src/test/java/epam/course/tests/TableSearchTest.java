package epam.course.tests;

import epam.course.InitTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.epam.jdi.uitests.core.preconditions.PreconditionsState.isInState;
import static com.epam.web.matcher.testng.Assert.*;
import static epam.course.JDISite.dynamicTablePage;
import static epam.course.enums.Preconditions.LOGGED_IN;

/**
 * Created by Rita on 28.11.2016.
 */
public class TableSearchTest extends InitTests {

    @BeforeClass
    public void before() {
        isInState(LOGGED_IN);
        dynamicTablePage.isOpened();
    }

    @Test
    public void searchNonExistent() {
        dynamicTablePage.searchInput.clear();
        dynamicTablePage.searchInput.sendKeys("lorem");
        assertContains(dynamicTablePage.emptyMessage.getText(), "No matching records found");
    }

    @Test
    public void searchExisting() {
        dynamicTablePage.searchInput.clear();
        dynamicTablePage.searchInput.sendKeys("linq");
        //assertEquals(dynamicTablePage.table.cellsMatch("LINQ").size(), dynamicTablePage.table.rows().count());
        ignoreCase().contains(dynamicTablePage.table.cell(3, 1).getText(), "linq");
    }

}
