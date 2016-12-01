package epam.course.pageobjects;

import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.web.selenium.elements.complex.RadioButtons;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import epam.course.entities.Summary;
import epam.course.enums.EvenRadio;
import epam.course.enums.OddsRadio;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Rita on 23.11.2016.
 */
public class SummarySection extends Section {
    @FindBy(css = "#odds-selector .radio")
    public RadioButtons<OddsRadio> odds;
    @FindBy(css = "#even-selector .radio")
    public RadioButtons<EvenRadio> evens;
    @FindBy(id = "calculate-button")
    public IButton calculate;

    @Step("Select the radios and submit the Summary form")
    public void submitSummary(Summary summary) {
        odds.select(summary.oddsRadio);
        evens.select(summary.evenRadio);
        calculate.click();
    }
}
