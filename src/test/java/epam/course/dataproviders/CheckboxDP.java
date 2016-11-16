package epam.course.dataproviders;

import org.testng.annotations.DataProvider;

/**
 * Created by Rita on 16.11.2016.
 */
public class CheckboxDP {

    @DataProvider(name = "checkbox")
    public static Object[][] checkboxData() {
        return new Object[][] {
                {true, false, false, false},
                {false, true, false, false},
                {false, false, true, false},
                {false, false, false, true},
                {true, true, false, false},
                {true, false, true, false},
                {true, false, false, true},
                {false, true, true, false},
                {false, true, false, true},
                {false, false, true, true},
                {true, true, true, false},
                {true, true, false, true},
                {false, true, true, true},
                {true, false, true, true},
                {true, true, true, true},
                {false, false, false, false}
        };
    }

}
