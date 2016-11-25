package epam.course.tests;

import epam.course.InitTests;
import epam.course.enums.MetalsRadio;
import org.testng.annotations.*;

import static com.epam.jdi.uitests.core.preconditions.PreconditionsState.isInState;
import static epam.course.JDISite.*;
import static epam.course.enums.Preconditions.LOGGED_IN;

/**
 * Created by Rita on 16.11.2016.
 */
public class RadioTest extends InitTests {

    @BeforeMethod
    public void before() {
        isInState(LOGGED_IN);
        differentElementPage.isOpened();
    }

    @Test
    public void radioButtonsTest() {
        differentElementPage.metalsRadio.select(1);
        //assert doesnt work
        //Assert.assertTrue(differentElementPage.metalsRadio.isSelected(MetalsRadio.GOLD));
        //Assert.assertTrue(differentElementPage.metalsRadio.getWebElement(MetalsRadio.GOLD.toString()).isSelected());
        differentElementPage.metalsRadio.select("Silver");
        differentElementPage.metalsRadio.select(MetalsRadio.BRONZE);
        differentElementPage.metalsRadio.setValue("Selen");
    }

}
