package epam.course.dataproviders;

import epam.course.entities.Plate;
import epam.course.entities.Summary;
import epam.course.enums.*;
import org.testng.annotations.DataProvider;

/**
 * Created by Rita on 21.11.2016.
 */
public class PlateDP {

    @DataProvider(name = "metalsAndColors")
    public static Object[][] metalsAndColorsData() {
        return new Object[][]{
                {new Plate(new Summary(OddsRadio.FIVE, EvenRadio.EIGHT),
                           new ElementsCheckbox[]{ElementsCheckbox.WATER, ElementsCheckbox.EARTH},
                           ColorsDropdown.RED,
                           MetalsRadio.BRONZE,
                           new SaladComponent[]{SaladComponent.CUCUMBER, SaladComponent.ONION}
                           )},
                {new Plate(new Summary(OddsRadio.ONE, EvenRadio.SIX),
                        new ElementsCheckbox[]{ElementsCheckbox.WATER, ElementsCheckbox.EARTH, ElementsCheckbox.FIRE},
                        ColorsDropdown.GREEN,
                        MetalsRadio.SILVER,
                        new SaladComponent[]{SaladComponent.ONION}
                )},
                {new Plate(new Summary(),
                        new ElementsCheckbox[]{},
                        ColorsDropdown.YELLOW,
                        MetalsRadio.SELEN,
                        new SaladComponent[]{}
                )}
        };
    }

}
