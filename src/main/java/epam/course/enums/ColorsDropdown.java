package epam.course.enums;

/**
 * Created by Rita on 21.11.2016.
 */
public enum ColorsDropdown {
    COLORS("Colors"), RED("Red"), GREEN("Green"), BLUE("Blue"), YELLOW("Yellow");

    public String value;

    ColorsDropdown(String value) {
        this.value = value;
    }
}