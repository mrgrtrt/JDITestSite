package epam.course.pages;

import com.epam.jdi.uitests.core.interfaces.common.IText;
import com.epam.jdi.uitests.core.interfaces.common.ITextField;
import com.epam.jdi.uitests.core.interfaces.complex.IDropDown;
import com.epam.jdi.uitests.web.selenium.elements.complex.table.interfaces.ITable;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.JDropdown;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Rita on 28.11.2016.
 */
public class TableWithPagesPage extends WebPage {
    @JDropdown(
            root = @FindBy(id = "DataTables_Table_0_length"),
            value = @FindBy(css = "#DataTables_Table_0_length label select"),
            elementByName = @FindBy(css = "option")
    ) public IDropDown entries;

    @FindBy(css = "#DataTables_Table_0_filter input")
    public ITextField searchInput;
    @FindBy(id = "DataTables_Table_0")
    public ITable table;
    @FindBy(id = "DataTables_Table_0_info")
    public IText entriesInfo;
    @FindBy(css = ".dataTables_empty")
    public IText emptyMessage;
}
