package epam.course.tests;

import epam.course.InitTests;
import epam.course.dataproviders.CheckboxDP;
import org.testng.annotations.*;

import static com.epam.jdi.uitests.core.preconditions.PreconditionsState.isInState;
import static epam.course.JDISite.*;
import static epam.course.enums.Preconditions.LOGGED_IN;

/**
 * Created by Rita on 16.11.2016.
 */
public class CheckboxesTest extends InitTests {

    @BeforeTest
    public void before() {
        isInState(LOGGED_IN);
        differentElementPage.isOpened();
    }

    @Test(dataProviderClass = CheckboxDP.class, dataProvider = "checkbox")
    public void checkboxTest(boolean waterCheck, boolean earthCheck, boolean windCheck, boolean fireCheck) {
        differentElementPage.checkboxesChecking(waterCheck, earthCheck, windCheck, fireCheck);
    }

}
