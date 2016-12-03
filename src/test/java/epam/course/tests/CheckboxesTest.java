package epam.course.tests;

import epam.course.InitTests;
import epam.course.dataproviders.CheckboxDP;
import epam.course.enums.ElementsCheckbox;
import org.testng.annotations.*;
import ru.yandex.qatools.allure.annotations.Title;

import java.util.List;

import static com.epam.jdi.uitests.core.preconditions.PreconditionsState.isInState;
import static com.epam.web.matcher.testng.Assert.assertContains;
import static epam.course.JDISite.*;
import static epam.course.enums.Preconditions.LOGGED_IN;

/**
 * Created by Rita on 16.11.2016.
 */
public class CheckboxesTest extends InitTests {

    @BeforeClass(alwaysRun = true)
    public void before() {
        isInState(LOGGED_IN);
        differentElementPage.isOpened();
    }

    @Title("Test checkboxes on 'Different Elements Page' as CheckList")
    @Test(dataProviderClass = CheckboxDP.class, dataProvider = "checkList", groups = { "DifferentElementsPage" })
    public void checkListTest(ElementsCheckbox[] elementsCheckList) {
        differentElementPage.checkList.check(elementsCheckList);
        //instead of uncheck() method because uncheck() works incorrect
        differentElementPage.checkList.check(elementsCheckList);
        for (int i = 0; i < elementsCheckList.length; i++) {
            assertContains(actionsLog.getTextList().get(i), "condition changed to false");
        }
    }
}
