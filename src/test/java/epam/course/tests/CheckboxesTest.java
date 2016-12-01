package epam.course.tests;

import epam.course.InitTests;
import epam.course.dataproviders.CheckboxDP;
import org.testng.annotations.*;
import ru.yandex.qatools.allure.annotations.Title;

import static com.epam.jdi.uitests.core.preconditions.PreconditionsState.isInState;
import static epam.course.JDISite.*;
import static epam.course.enums.Preconditions.LOGGED_IN;

/**
 * Created by Rita on 16.11.2016.
 */
public class CheckboxesTest extends InitTests {

    @BeforeClass
    public void before() {
        isInState(LOGGED_IN);
        differentElementPage.isOpened();
    }

    @Title("Test checkboxes on 'Different Elements Page'")
    @Test(dataProviderClass = CheckboxDP.class, dataProvider = "checkbox")
    public void checkboxTest(boolean waterCheck, boolean earthCheck, boolean windCheck, boolean fireCheck) {
        differentElementPage.checkboxesChecking(waterCheck, earthCheck, windCheck, fireCheck);
    }

}
