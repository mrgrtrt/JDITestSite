package epam.course.tests;

import epam.course.InitTests;
import epam.course.enums.MetalsRadio;
import org.testng.annotations.*;
import ru.yandex.qatools.allure.annotations.Title;

import static com.epam.jdi.uitests.core.preconditions.PreconditionsState.isInState;
import static com.epam.web.matcher.testng.Assert.assertContains;
import static epam.course.JDISite.*;
import static epam.course.enums.Preconditions.LOGGED_IN;

/**
 * Created by Rita on 16.11.2016.
 */
public class RadioTest extends InitTests {

    @BeforeClass
    public void before() {
        isInState(LOGGED_IN);
        differentElementPage.isOpened();
    }

    @Title("Test radio buttons on 'Different Elements Page'")
    @Test
    public void radioButtonsTest() {
        differentElementPage.metalsRadio.select(1);
        assertContains(actionsLog.getFirstText(), "metal: value changed to Gold");
        //assert doesnt work
        //Assert.assertTrue(differentElementPage.metalsRadio.isSelected(MetalsRadio.GOLD));
        differentElementPage.metalsRadio.select("Silver");
        assertContains(actionsLog.getFirstText(), "metal: value changed to Silver");
        differentElementPage.metalsRadio.select(MetalsRadio.BRONZE);
        assertContains(actionsLog.getFirstText(), "metal: value changed to Bronze");
        differentElementPage.metalsRadio.setValue("Selen");
        assertContains(actionsLog.getFirstText(), "metal: value changed to Selen");
    }

}
