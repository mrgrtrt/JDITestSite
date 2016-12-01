package epam.course.pages;

import com.epam.jdi.uitests.core.interfaces.base.IClickable;
import com.epam.jdi.uitests.core.interfaces.common.ITextField;
import com.epam.jdi.uitests.web.robot.RFileInput;
import com.epam.jdi.uitests.web.selenium.elements.common.DatePicker;
import com.epam.jdi.uitests.web.selenium.elements.complex.table.interfaces.ITable;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import epam.course.pageobjects.ContactForm;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Rita on 30.11.2016.
 */
public class DatesPage extends WebPage {
    @FindBy(className = "form")
    public ContactForm contactForm;
    @FindBy(css = "#datepicker input")
    public DatePicker datePickerInput;
    @FindBy(css = ".datepicker-days table")
    public ITable datePickerDaysTable;
    @FindBy(id = "timepicker")
    public ITextField timePickerInput;
    @FindBy(css = ".uui-timepicker span")
    public IClickable timePickerButton;
    @FindBy(css = "[data-provides=fileinput] a")
    public RFileInput imageInput;

}
