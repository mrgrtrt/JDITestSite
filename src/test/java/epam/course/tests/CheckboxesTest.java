package epam.course.tests;

import com.epam.jdi.uitests.web.selenium.elements.common.CheckBox;
import epam.course.InitTests;
import epam.course.dataproviders.CheckboxDP;
import epam.course.objects.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.lang.reflect.Method;

import static epam.course.JDISite.differentElementPage;
import static epam.course.JDISite.homePage;
import static epam.course.JDISite.login;

/**
 * Created by Rita on 16.11.2016.
 */
public class CheckboxesTest extends InitTests {

    @BeforeTest
    public void before() {
        homePage.isOpened();
        login.submit(new User("epam", "1234"));
        differentElementPage.open();
    }

    @Test(dataProviderClass = CheckboxDP.class, dataProvider = "checkbox")
    public void checkboxTest(boolean waterCheck, boolean earthCheck, boolean windCheck, boolean fireCheck) {
        differentElementPage.checkboxesChecking(waterCheck, earthCheck, windCheck, fireCheck);
    }

}
