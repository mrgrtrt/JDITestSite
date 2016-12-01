package epam.course.tests;

import epam.course.InitTests;
import epam.course.dataproviders.ContactFormDP;
import epam.course.entities.Contact;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Title;

import static com.epam.jdi.uitests.core.preconditions.PreconditionsState.isInState;
import static com.epam.web.matcher.testng.Assert.matches;
import static epam.course.JDISite.contactPage;
import static epam.course.JDISite.resultsLog;
import static epam.course.enums.Preconditions.LOGGED_IN;

/**
 * Created by Rita on 27.11.2016.
 */
public class ContactFormTest extends InitTests {

    @BeforeClass
    public void before() {
        isInState(LOGGED_IN);
        contactPage.isOpened();
    }

    @Title("Test contact form")
    @Test(dataProviderClass = ContactFormDP.class, dataProvider = "contactForm")
    public void formFill(Contact contact){
        contactPage.contactForm.submit(contact);
        contactPage.contactForm.verify(contact);

        matches(resultsLog.getText(0), "Summary: 3");
        matches(resultsLog.getText(1), "Name: " + contact.name);
        matches(resultsLog.getText(2), "Last Name: " + contact.lastName);
        matches(resultsLog.getText(3), "Description: " + contact.description);
    }

}
