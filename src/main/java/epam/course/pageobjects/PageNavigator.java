package epam.course.pageobjects;

import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.web.selenium.elements.composite.Pagination;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Rita on 21.11.2016.
 */
public class PageNavigator extends Pagination {

    @FindBy(css = ".prev a")
    public IButton prev;
    @FindBy(css = ".next a")
    public IButton next;
    @FindBy(css = ".first a")
    public IButton first;
    @FindBy(css = ".last a")
    public IButton last;
    @FindBy(css = ".uui-pagination li")
    public IButton page;
    
}
