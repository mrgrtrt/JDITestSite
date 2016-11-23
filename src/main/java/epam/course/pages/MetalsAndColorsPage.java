package epam.course.pages;

import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.core.interfaces.complex.ICheckList;
import com.epam.jdi.uitests.web.selenium.elements.complex.RadioButtons;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import epam.course.entities.Plate;
import epam.course.enums.*;
import epam.course.pageobjects.SummarySection;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rita on 21.11.2016.
 */
public class MetalsAndColorsPage extends WebPage {
    @FindBy(id = "summary-block")
    public SummarySection summarySection;

    @FindBy(css = "#elements-checklist label")
    public ICheckList<ElementsCheckbox> elementsCheckbox;



}
