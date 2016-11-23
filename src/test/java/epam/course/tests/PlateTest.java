package epam.course.tests;

import epam.course.InitTests;
import epam.course.dataproviders.PlateDP;
import epam.course.entities.Plate;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.epam.jdi.uitests.core.preconditions.PreconditionsState.isInState;
import static epam.course.JDISite.metalsAndColorsPage;
import static epam.course.enums.Preconditions.LOGGED_IN;

/**
 * Created by Rita on 23.11.2016.
 */
public class PlateTest extends InitTests {

    @BeforeTest
    public void before() {
        isInState(LOGGED_IN);
        metalsAndColorsPage.isOpened();
    }

    @Test(dataProviderClass = PlateDP.class, dataProvider = "metalsAndColors")
    public void checkboxTest(Plate plate) {
        metalsAndColorsPage.summarySection.submitSummary(plate.summary);
    }
}
