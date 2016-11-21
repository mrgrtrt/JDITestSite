package epam.course.pageobjects;

import com.epam.jdi.uitests.core.interfaces.base.IClickable;
import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.core.interfaces.common.ITextField;
import com.epam.jdi.uitests.web.selenium.elements.composite.Search;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Rita on 21.11.2016.
 */
public class SearchField extends Search {

    @FindBy(css = ".search>.icon-search")
    private IClickable siteSearch;
    @FindBy(css = ".search-field input")
    private ITextField searchInput;
    @FindBy(css = ".search .search-active .icon-search")
    private IButton searchButton;

    //find() is final so we override findAction()
    @Override
    public void findAction(String text) {
        siteSearch.click();
        super.findAction(text);
    }

}
