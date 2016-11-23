package epam.course.entities;

import epam.course.enums.ColorsDropdown;
import epam.course.enums.ElementsCheckbox;
import epam.course.enums.MetalsRadio;
import epam.course.enums.SaladComponent;

/**
 * Created by Rita on 21.11.2016.
 */
public class Plate {
    public Summary summary;
    public ElementsCheckbox[] elementsCheckboxes;
    public ColorsDropdown color;
    public MetalsRadio metal;
    public SaladComponent[] saladComponents;

    public Plate(Summary summary, ElementsCheckbox[] elementsCheckboxes,
                 ColorsDropdown color, MetalsRadio metal,
                 SaladComponent[] saladComponents) {
        this.summary = summary;
        this.elementsCheckboxes = elementsCheckboxes;
        this.color = color;
        this.metal = metal;
        this.saladComponents = saladComponents;
    }
}
