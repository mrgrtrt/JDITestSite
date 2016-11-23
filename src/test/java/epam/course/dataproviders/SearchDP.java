package epam.course.dataproviders;

import org.testng.annotations.DataProvider;

/**
 * Created by Rita on 21.11.2016.
 */
public class SearchDP {

    @DataProvider(name = "search")
    public static Object[][] searchData() {
        return new Object[][]{
                {"Lorem"},
                {"Ipsum"},
                {"dolor"},
                {"sit"}
        };
    }

}
