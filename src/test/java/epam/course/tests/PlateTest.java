package epam.course.tests;

import epam.course.InitTests;
import epam.course.dataproviders.PlateDP;
import epam.course.entities.Plate;
import epam.course.enums.ElementsCheckbox;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static com.epam.jdi.uitests.core.preconditions.PreconditionsState.isInState;
import static epam.course.JDISite.metalsAndColorsPage;
import static epam.course.enums.Preconditions.LOGGED_IN;

/**
 * Created by Rita on 23.11.2016.
 */
public class PlateTest extends InitTests {

    List<String> elements = new ArrayList<>();

    @BeforeTest
    public void before() {
        isInState(LOGGED_IN);
        metalsAndColorsPage.isOpened();
    }

    @Test(dataProviderClass = PlateDP.class, dataProvider = "metalsAndColors")
    public void plateTest(Plate plate) {
        //submit summary form
        metalsAndColorsPage.summarySection.submitSummary(plate.summary);

        //check elements form's checkboxes
        for (ElementsCheckbox elementsCheckbox : plate.elementsCheckboxes) {
            elements.add(elementsCheckbox.value);
            metalsAndColorsPage.elementsCheckbox.select(elementsCheckbox);
        }

        //

    }
}
