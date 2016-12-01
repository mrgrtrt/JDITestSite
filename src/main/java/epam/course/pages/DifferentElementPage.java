package epam.course.pages;



import com.epam.jdi.uitests.web.selenium.elements.common.CheckBox;
import com.epam.jdi.uitests.web.selenium.elements.complex.RadioButtons;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import epam.course.enums.MetalsRadio;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Rita on 16.11.2016.
 */
public class DifferentElementPage extends WebPage {

    @FindBy(xpath = "//label[contains(., 'Water')]/input")
    private CheckBox water;
    @FindBy(xpath = "//label[contains(., 'Earth')]/input")
    private CheckBox earth;
    @FindBy(xpath = "//label[contains(., 'Wind')]/input")
    private CheckBox wind;
    @FindBy(xpath = "//label[contains(., 'Fire')]/input")
    private CheckBox fire;

    @FindBy(css = ".checkbox-row .label-radio")
    public RadioButtons<MetalsRadio> metalsRadio;

    @Step("Check all necessary checkboxes from data provider")
    public void checkboxesChecking(boolean waterCheck, boolean earthCheck, boolean windCheck, boolean fireCheck) {
        checkboxSwitch(water, waterCheck);
        checkboxSwitch(earth, earthCheck);
        checkboxSwitch(wind, windCheck);
        checkboxSwitch(fire, fireCheck);

        Assert.assertEquals(waterCheck, water.isChecked());
        Assert.assertEquals(earthCheck, earth.isChecked());
        Assert.assertEquals(windCheck, wind.isChecked());
        Assert.assertEquals(fireCheck, fire.isChecked());
    }

    private void checkboxSwitch(CheckBox checkbox, boolean toCheck) {
        if (toCheck) {
            checkbox.check();
        } else checkbox.uncheck();
    }

}
