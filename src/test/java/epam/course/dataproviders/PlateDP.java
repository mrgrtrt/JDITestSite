package epam.course.dataproviders;

import epam.course.entities.Plate;
import epam.course.entities.Summary;
import epam.course.enums.ElementsCheckbox;
import epam.course.enums.EvenRadio;
import epam.course.enums.OddsRadio;
import org.testng.annotations.DataProvider;

/**
 * Created by Rita on 21.11.2016.
 */
public class PlateDP {

    @DataProvider(name = "metalsAndColors")
    public static Object[][] metalsAndColorsData() {
        return new Object[][]{
                {new Plate(new Summary(OddsRadio.FIVE, EvenRadio.EIGHT),
                           new ElementsCheckbox[]{ElementsCheckbox.EARTH, ElementsCheckbox.WATER}
                           )}
        };
    }

}
