package epam.course.pages;

import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.core.interfaces.complex.ICheckList;
import com.epam.jdi.uitests.core.interfaces.complex.IDropDown;
import com.epam.jdi.uitests.core.interfaces.complex.IDropList;
import com.epam.jdi.uitests.web.selenium.elements.complex.ComboBox;
import com.epam.jdi.uitests.web.selenium.elements.complex.DropList;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.JDropdown;
import epam.course.enums.*;
import epam.course.pageobjects.SummarySection;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Rita on 21.11.2016.
 */
public class MetalsAndColorsPage extends WebPage {
    @FindBy(id = "summary-block")
    public SummarySection summarySection;

    @FindBy(css = "#elements-checklist label")
    public ICheckList<ElementsCheckbox> elementsCheckbox;

    @JDropdown(
            root = @FindBy(css = ".colors"),
            value = @FindBy(css = "[data-id='colors-dropdown']"),
            elementByName = @FindBy(tagName = "li")
    ) public IDropDown<ColorsDropdown> colors;

    @JDropdown(
            root = @FindBy(css = ".metals"),
            value = @FindBy(css =  "[data-id='metals-combobox']"),
            expand = @FindBy(css = ".metals .caret"),
            elementByName = @FindBy(tagName = "li")
    )
    public ComboBox<MetalsRadio> metals = new ComboBox<>(By.cssSelector(".metals input"));

    public IDropList<SaladComponent> saladComponent = new DropList<>(
            By.id("salad-dropdown"),
            By.cssSelector("#salad-dropdown li"),
            By.cssSelector("#salad-dropdown li label")
    );

    @FindBy(id = "submit-button")
    public IButton submitButton;

    public void uncheckAll() {
        saladComponent.check(SaladComponent.SALAD);
    }
}
