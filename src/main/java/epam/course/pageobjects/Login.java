package epam.course.pageobjects;

import com.epam.jdi.uitests.core.interfaces.base.IClickable;
import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.core.interfaces.common.IText;
import com.epam.jdi.uitests.core.interfaces.common.ITextField;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import epam.course.objects.User;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

/**
 * Created by Rita on 15.11.2016.
 */
public class Login extends Form<User> {

    @FindBy(css = ".uui-profile-menu")
    private IClickable profile;
    @FindBy(id = "Login")
    private ITextField login;
    @FindBy(id = "Password")
    private ITextField password;
    @FindBy(css = ".btn-login")
    private IButton loginButton;
    @FindBy(css = ".logout span")
    private IText logoutText;
    @FindBy(css = ".login-txt")
    private IText errorMessageText;

    @Override
    public void submit(User user) {
        profile.click();
        super.submit(user);
    }

    public void validate(boolean userExists) {
        if (userExists) {
            Assert.assertEquals("LOGOUT", logoutText.getText());
        } else {
            Assert.assertEquals("* Login Faild", errorMessageText.getText());
        }
    }

}
