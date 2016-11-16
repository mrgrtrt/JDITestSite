package epam.course;

import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import epam.course.pageobjects.Login;
import epam.course.pages.DifferentElementPage;
import epam.course.pages.HomePage;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Rita on 15.11.2016.
 */
@JSite(domain = "https://jdi-framework.github.io/tests")
public class JDISite extends WebSite {

    @JPage(url = "/index.htm", title = "Index Page")
    public static HomePage homePage;

    @JPage(url = "/page8.htm", title = "Different Element")
    public static DifferentElementPage differentElementPage;

    @FindBy(css = ".uui-profile-menu")
    public static Login login;
}
