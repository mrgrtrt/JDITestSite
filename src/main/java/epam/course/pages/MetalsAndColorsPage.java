package epam.course.pages;

import com.epam.jdi.uitests.core.interfaces.complex.ICheckList;
import com.epam.jdi.uitests.core.interfaces.complex.IComboBox;
import com.epam.jdi.uitests.core.interfaces.complex.IDropDown;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import epam.course.enums.ColorsDropdown;
import epam.course.enums.ElementsCheckbox;
import epam.course.enums.MetalsRadio;
import epam.course.pageobjects.Summary;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Rita on 21.11.2016.
 */
public class MetalsAndColorsPage extends WebPage {
    @FindBy(id = "summary-block")
    public Summary summary;
    @FindBy(css = "#elements-checklist label")
    public ICheckList<ElementsCheckbox> elementsCheckbox;
    @FindBy(css = ".colors .filter-option")
    public IDropDown<ColorsDropdown> colorsDropdown;
    @FindBy(css = ".metals .filter-option")
    public IComboBox<MetalsRadio> metalsCombobox;
    @FindBy(id = "salad-dropdown")
    public IDropDown saladDropdown;

}
