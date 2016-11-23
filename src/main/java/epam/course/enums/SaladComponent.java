package epam.course.enums;

/**
 * Created by Rita on 24.11.2016.
 */
public enum SaladComponent {

    CUCUMBER("Cucumber"), TOMATO("Tomato"), SALAD("Salad"), ONION("Onion");

    public String value;

    SaladComponent(String value) {
        this.value = value;
    }
}
