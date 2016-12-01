package epam.course.pages;

import com.epam.jdi.uitests.web.selenium.elements.complex.table.interfaces.ITable;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Rita on 27.11.2016.
 */
public class SimpleTablePage extends WebPage {
    @FindBy(css = "table tbody")
    public ITable simpleTable;
}
