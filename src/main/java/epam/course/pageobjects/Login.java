package epam.course.pageobjects;

import com.epam.jdi.uitests.core.interfaces.base.IClickable;
import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.core.interfaces.common.IText;
import com.epam.jdi.uitests.core.interfaces.common.ITextField;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import epam.course.entities.User;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Rita on 15.11.2016.
 */
public class Login extends Form<User> {

    @FindBy(css = ".profile-photo")
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
    @Step("Fill and submit the login form")
    public void login(User user) {
        profile.click();
        login.clear();
        password.clear();
        super.login(user);
    }

    @Step("Check if the login data is right")
    public void validate(User user) {
        if (user.isExists) {
            Assert.assertEquals("LOGOUT", logoutText.getText());
        } else {
            Assert.assertEquals("* Login Faild", errorMessageText.getText());
            profile.click();
        }
    }

}
