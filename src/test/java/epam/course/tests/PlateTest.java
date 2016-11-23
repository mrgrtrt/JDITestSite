package epam.course.tests;

import epam.course.InitTests;
import epam.course.dataproviders.PlateDP;
import epam.course.entities.Plate;
import epam.course.enums.ElementsCheckbox;
import epam.course.enums.MetalsRadio;
import epam.course.enums.SaladComponent;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static com.epam.jdi.uitests.core.preconditions.PreconditionsState.isInState;
import static epam.course.JDISite.metalsAndColorsPage;
import static epam.course.enums.Preconditions.LOGGED_IN;
import static java.util.Arrays.asList;

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
    public void plateTest(Plate plate) {
        //submit summary form
        metalsAndColorsPage.summarySection.submitSummary(plate.summary);
        //Assert.assertTrue(metalsAndColorsPage.summarySection.odds.isSelected(plate.summary.oddsRadio));

        //check elements form's checkboxes
        for (ElementsCheckbox elementsCheckbox : plate.elementsCheckboxes) {
            metalsAndColorsPage.elementsCheckbox.select(elementsCheckbox);
        }

        //pick a color in a dropdown
        metalsAndColorsPage.colors.select(plate.color);

        //combobox
        metalsAndColorsPage.metals.select(plate.metal);
        metalsAndColorsPage.metals.setValue(plate.metal.toString());

        //droplist
        metalsAndColorsPage.uncheckAll();
        for (SaladComponent saladComponent : plate.saladComponents) {
            metalsAndColorsPage.saladComponent.check(saladComponent);
        }

        //submit
        metalsAndColorsPage.submitButton.click();
    }
}
