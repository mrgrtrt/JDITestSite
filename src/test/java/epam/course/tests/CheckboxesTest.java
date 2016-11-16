package epam.course.tests;

import com.epam.jdi.uitests.web.selenium.elements.common.CheckBox;
import epam.course.InitTests;
import epam.course.dataproviders.CheckboxDP;
import epam.course.objects.User;
import org.testng.annotations.*;

import java.io.IOException;
import java.lang.reflect.Method;

import static epam.course.JDISite.*;

/**
 * Created by Rita on 16.11.2016.
 */
public class CheckboxesTest extends InitTests {

    @BeforeMethod
    public void before() {
        //homePage.isOpened();
        //login.submit(new User("epam", "1234"));
        differentElementPage.isOpened();
    }

    @Test(dataProviderClass = CheckboxDP.class, dataProvider = "checkbox")
    public void checkboxTest(boolean waterCheck, boolean earthCheck, boolean windCheck, boolean fireCheck) {
        differentElementPage.checkboxesChecking(waterCheck, earthCheck, windCheck, fireCheck);
    }

}
