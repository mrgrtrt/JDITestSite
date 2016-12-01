package epam.course.pages;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import epam.course.pageobjects.ContactForm;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Rita on 21.11.2016.
 */
public class ContactPage extends WebPage {
    @FindBy(className = "form")
    public ContactForm contactForm;
}
