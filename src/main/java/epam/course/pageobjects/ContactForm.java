package epam.course.pageobjects;

import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.core.interfaces.common.ITextArea;
import com.epam.jdi.uitests.core.interfaces.common.ITextField;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Rita on 27.11.2016.
 */
public class ContactForm extends Form {
    @FindBy(id = "Name")
    public ITextField name;
    @FindBy(id = "LastName")
    public ITextField lastName;
    @FindBy(id = "Description")
    public ITextArea description;
    @FindBy(xpath = "//*[text()='Submit']")
    public IButton contactSubmit;
}
