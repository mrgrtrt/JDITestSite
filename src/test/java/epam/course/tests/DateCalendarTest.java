package epam.course.tests;

import epam.course.InitTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Title;

import static com.epam.commons.Timer.nowTime;
import static com.epam.jdi.uitests.core.preconditions.PreconditionsState.isInState;
import static com.epam.web.matcher.testng.Assert.assertEquals;
import static epam.course.JDISite.*;
import static epam.course.enums.Preconditions.LOGGED_IN;

/**
 * Created by Rita on 30.11.2016.
 */
// TODO: 30.11.2016 добавить везде clickCenter()
public class DateCalendarTest extends InitTests {

    @BeforeClass
    public void before() {
        isInState(LOGGED_IN);
        datesPage.isOpened();
    }

    @Title("Enter now date into the datepicker field on 'Dates' page")
    @Test
    public void enterNowDate() {
        datesPage.datePickerInput.newInput(nowTime("MM/dd/yyyy"));
        assertEquals(datesPage.datePickerInput.getText(), nowTime("MM/dd/yyyy"));
    }

    @Title("Enter the empty space into the datepicker field on 'Dates' page")
    @Test
    public void enterEmptyDate() {
        datesPage.datePickerInput.newInput(" ");
        assertEquals(datesPage.datePickerInput.getText(), " ");
    }

    @Title("Enter valid date into the datepicker field on 'Dates' page")
    @Test
    public void enterValidDate() {
        datesPage.datePickerInput.newInput("11/25/1994");
        assertEquals(datesPage.datePickerInput.getText(), "11/25/1994");
    }

    @Title("Enter invalid date into the datepicker field on 'Dates' page")
    @Test
    public void enterInvalidDate() {
        datesPage.datePickerInput.newInput("25/11");
        datesPage.contactForm.clickCenter();
        assertEquals(datesPage.datePickerInput.getText(), nowTime("MM/dd/yyyy"));
    }

    //дальше сложна // TODO: 30.11.2016 дальше тестить календарь 
    @Title("Test month header into the calendar table on 'Dates' page")
    @Test
    public void datepickerDaysTable() {
        datesPage.datePickerInput.clickCenter();
        String nowDate = datesPage.datePickerDaysTable.header().value(1).getText();
        datesPage.datePickerDaysTable.header("«").click();
        datesPage.datePickerDaysTable.header("»").click();
        assertEquals(datesPage.datePickerDaysTable.header().value(1).getText(), nowDate);
    }

}
