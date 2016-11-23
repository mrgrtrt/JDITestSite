package epam.course.entities;

import epam.course.enums.ElementsCheckbox;

/**
 * Created by Rita on 21.11.2016.
 */
public class Plate {
    public Summary summary;
    public ElementsCheckbox[] elementsCheckboxes;

    public Plate(Summary summary, ElementsCheckbox[] elementsCheckboxes) {
        this.summary = summary;
        this.elementsCheckboxes = elementsCheckboxes;
    }
}
