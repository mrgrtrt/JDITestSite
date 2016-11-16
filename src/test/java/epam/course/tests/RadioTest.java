package epam.course.tests;

import epam.course.InitTests;
import epam.course.enums.MetalsRadio;
import epam.course.objects.User;
import org.testng.annotations.*;

import static epam.course.JDISite.*;

/**
 * Created by Rita on 16.11.2016.
 */
public class RadioTest extends InitTests {

    @BeforeMethod
    public void before() {
        differentElementPage.isOpened();
    }

    @Test
    public void radioButtonsTest() {
        differentElementPage.metalsRadio.select(1);
        differentElementPage.metalsRadio.select("Silver");
        differentElementPage.metalsRadio.select(MetalsRadio.BRONZE);
        differentElementPage.metalsRadio.setValue("Selen");
    }

}
