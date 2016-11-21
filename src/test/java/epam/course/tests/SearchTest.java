package epam.course.tests;

import epam.course.InitTests;
import epam.course.dataproviders.SearchDP;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static epam.course.JDISite.*;

/**
 * Created by Rita on 21.11.2016.
 */
public class SearchTest extends InitTests {

    @BeforeTest
    public void before() {
        homePage.isOpened();
        //login.submit(new User(true, "epam", "1234"));
    }

    @Test(dataProviderClass = SearchDP.class, dataProvider = "search")
    public void searchTest() {
        //search.siteSearch.click();
        //search.searchInput.sendKeys("text");
        //search.searchButton.click();
        search.find("text");
        supportPage.checkOpened();
    }

}
