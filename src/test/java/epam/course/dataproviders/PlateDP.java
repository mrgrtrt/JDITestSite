package epam.course.dataproviders;

import epam.course.entities.Plate;
import org.testng.annotations.DataProvider;

/**
 * Created by Rita on 21.11.2016.
 */
public class PlateDP {

    @DataProvider(name = "metalsAndColors")
    public static Object[][] metalsAndColorsData() {
        return new Object[][]{
                {new Plate("3", "6", "WInd", "Green", "Bronze")},
                {new Plate("3", "6", "WInd", "Green", "Bronze")},
                {new Plate("3", "6", "WInd", "Green", "Bronze")},
                {new Plate("3", "6", "WInd", "Green", "Bronze")}
        };
    }

}
