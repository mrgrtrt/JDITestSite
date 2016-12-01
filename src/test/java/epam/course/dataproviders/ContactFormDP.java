package epam.course.dataproviders;

import epam.course.entities.Contact;
import org.testng.annotations.DataProvider;

/**
 * Created by Rita on 27.11.2016.
 */
public class ContactFormDP {

    @DataProvider(name = "contactForm")
    public static Object[][] contactData() {
        return new Object[][]{
                {new Contact("Name", "Last name", "Lorem ipsum dolor sit amet, consectetur adipiscing elit," +
                        "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.")},
                {new Contact("Holden Caulfield", "Caulfield", "The Catcher in the Rye")},
                {new Contact(" ", " ", " ")}
        };
    }
}
