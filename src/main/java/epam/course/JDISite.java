package epam.course;

import com.epam.jdi.uitests.core.interfaces.base.IClickable;
import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.core.interfaces.common.IText;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import epam.course.pageobjects.Login;
import epam.course.pageobjects.PageNavigator;
import epam.course.pageobjects.SearchField;
import epam.course.pages.*;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Rita on 15.11.2016.
 */
@JSite(domain = "https://jdi-framework.github.io/tests")
public class JDISite extends WebSite {

    @JPage(url = "/index.htm", title = "Index Page")
    public static HomePage homePage;

    @JPage(url = "/page1.htm", title = "Contact Form")
    public static ContactPage contactPage;

    @JPage(url = "/page2.htm", title = "Metal and Colors")
    public static MetalsAndColorsPage metalsAndColorsPage;

    @JPage(url = "/page3.htm", title = "Support")
    public static SupportPage supportPage;

    @JPage(url = "/page8.htm", title = "Different Element")
    public static DifferentElementPage differentElementPage;

    @FindBy(css = ".uui-profile-menu")
    public static Login login;

    @FindBy(css = ".logout")
    public static IButton logout;

    @FindBy(css = ".profile-photo span")
    public static IText userName;

    @FindBy(css = ".uui-profile-menu")
    public static IClickable profile;

    @FindBy(className = "uui-pagination")
    public static PageNavigator pageNavigator;



    public static SearchField search;


}
