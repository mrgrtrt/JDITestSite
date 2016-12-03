package epam.course.pages;

import com.epam.jdi.uitests.core.interfaces.complex.ICheckList;
import com.epam.jdi.uitests.web.selenium.elements.complex.RadioButtons;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import epam.course.enums.ElementsCheckbox;
import epam.course.enums.MetalsRadio;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Rita on 16.11.2016.
 */
public class DifferentElementPage extends WebPage {

    @FindBy(css = ".checkbox-row .label-checkbox")
    public ICheckList<ElementsCheckbox> checkList;

    @FindBy(css = ".checkbox-row .label-radio")
    public RadioButtons<MetalsRadio> metalsRadio;

}
