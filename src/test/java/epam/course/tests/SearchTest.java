package epam.course.tests;

import epam.course.InitTests;
import epam.course.dataproviders.SearchDP;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.epam.jdi.uitests.core.interfaces.Application.currentSite;
import static epam.course.JDISite.*;

/**
 * Created by Rita on 21.11.2016.
 */
public class SearchTest extends InitTests {


    @BeforeMethod
    public void before() {
        homePage.isOpened();
    }

    @Test(dataProviderClass = SearchDP.class, dataProvider = "search")
    public void searchTest(String text) {
        search.find(text);
        supportPage.checkOpened();
    }

}
