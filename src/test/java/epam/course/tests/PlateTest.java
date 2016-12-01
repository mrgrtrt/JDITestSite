package epam.course.tests;

import epam.course.InitTests;
import epam.course.dataproviders.PlateDP;
import epam.course.entities.Plate;
import epam.course.enums.ElementsCheckbox;
import epam.course.enums.SaladComponent;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Title;

import java.util.ArrayList;
import java.util.List;

import static com.epam.jdi.uitests.core.preconditions.PreconditionsState.isInState;
import static com.epam.web.matcher.testng.Assert.matches;
import static epam.course.JDISite.metalsAndColorsPage;
import static epam.course.JDISite.resultsLog;
import static epam.course.enums.Preconditions.LOGGED_IN;

/**
 * Created by Rita on 23.11.2016.
 */
public class PlateTest extends InitTests {

    @BeforeClass
    public void before() {
        isInState(LOGGED_IN);
        metalsAndColorsPage.isOpened();
    }

    @Title("Test 'Metals And Colors Page'")
    @Test(dataProviderClass = PlateDP.class, dataProvider = "metalsAndColors")
    public void plateTest(Plate plate) {
        metalsAndColorsPage.summarySection.submitSummary(plate.summary);

        List<String> elements = new ArrayList<>();
        for (ElementsCheckbox elementsCheckbox : plate.elementsCheckboxes) {
            metalsAndColorsPage.elementsCheckbox.select(elementsCheckbox);
            elements.add(elementsCheckbox.value);
        }
        String elementsString = String.join(", ", elements);

        metalsAndColorsPage.colors.select(plate.color);
        metalsAndColorsPage.metals.select(plate.metal);

        List<String> components = new ArrayList<>();
        metalsAndColorsPage.uncheckAll();
        for (SaladComponent saladComponent : plate.saladComponents) {
            metalsAndColorsPage.saladComponent.check(saladComponent);
            components.add(saladComponent.value);
        }
        String componentsString = String.join(", ", components);
        metalsAndColorsPage.submitButton.click();

        /*BUGs on the page(?)
        1. Если в первый раз заполнять форму (или после refresh()) без отмеченных чекбоксов
        в секции Elements, то в Result данная строка(без данных, просто "Elements: ") НЕ выводится вообще
        2. Если без refresh() сабмитить форму во 2й (или более) раз при этом сняв все отмеченные чекбоксы,
        то в Result строка "Elements: ..." не меняется
        */
        int summary = Integer.parseInt(plate.summary.oddsRadio.value) + Integer.parseInt(plate.summary.evenRadio.value);
        matches(resultsLog.getFirstText(), ("Summary: " + summary));
        matches(resultsLog.getText(1), ("Elements: " + elementsString));
        matches(resultsLog.getText(2), ("Color: " + plate.color.value));
        matches(resultsLog.getText(3), ("Metal: " + plate.metal.value));
        matches(resultsLog.getText(4), ("Vegetables: " + componentsString));

        metalsAndColorsPage.refresh();

    }


}
