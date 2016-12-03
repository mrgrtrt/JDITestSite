package epam.course.dataproviders;

import epam.course.enums.ElementsCheckbox;
import org.testng.annotations.DataProvider;

import static java.util.Arrays.asList;

/**
 * Created by Rita on 16.11.2016.
 */
public class CheckboxDP {

    @DataProvider(name = "checkList")
    public static Object[][] checkListData() {
        return new Object[][] {
                {new ElementsCheckbox[]{ElementsCheckbox.WATER}},
                {new ElementsCheckbox[]{ElementsCheckbox.EARTH}},
                {new ElementsCheckbox[]{ElementsCheckbox.WIND}},
                {new ElementsCheckbox[]{ElementsCheckbox.FIRE}},
                {new ElementsCheckbox[]{ElementsCheckbox.WATER, ElementsCheckbox.EARTH}},
                {new ElementsCheckbox[]{ElementsCheckbox.WATER, ElementsCheckbox.WIND}},
                {new ElementsCheckbox[]{ElementsCheckbox.WATER, ElementsCheckbox.FIRE}},
                {new ElementsCheckbox[]{ElementsCheckbox.EARTH, ElementsCheckbox.WIND}},
                {new ElementsCheckbox[]{ElementsCheckbox.EARTH, ElementsCheckbox.FIRE}},
                {new ElementsCheckbox[]{ElementsCheckbox.WIND, ElementsCheckbox.FIRE}},
                {new ElementsCheckbox[]{ElementsCheckbox.WATER, ElementsCheckbox.EARTH, ElementsCheckbox.WIND}},
                {new ElementsCheckbox[]{ElementsCheckbox.WATER, ElementsCheckbox.EARTH, ElementsCheckbox.FIRE}},
                {new ElementsCheckbox[]{ElementsCheckbox.EARTH, ElementsCheckbox.WIND, ElementsCheckbox.FIRE}},
                {new ElementsCheckbox[]{ElementsCheckbox.WATER, ElementsCheckbox.WIND, ElementsCheckbox.FIRE}},
                {new ElementsCheckbox[]{ElementsCheckbox.WATER, ElementsCheckbox.EARTH, ElementsCheckbox.WIND, ElementsCheckbox.FIRE}}
        };
    }

}
