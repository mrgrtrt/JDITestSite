package epam.course.tests;

import epam.course.InitTests;
import epam.course.dataproviders.SearchDP;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.epam.jdi.uitests.core.preconditions.PreconditionsState.isInState;
import static epam.course.JDISite.*;
import static epam.course.enums.Preconditions.LOGGED_IN;

/**
 * Created by Rita on 21.11.2016.
 */
public class SearchTest extends InitTests {

    @BeforeTest
    public void before() {
        isInState(LOGGED_IN);
    }

    @Test(dataProviderClass = SearchDP.class, dataProvider = "search")
    public void searchTest(String text) {
        search.find(text);
        supportPage.checkOpened();
    }

}
