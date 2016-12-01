package epam.course;

import com.epam.commons.Timer;
import com.epam.jdi.uitests.core.interfaces.MapInterfaceToElement;
import com.epam.jdi.uitests.core.interfaces.complex.ISearch;
import com.epam.jdi.uitests.core.settings.JDISettings;
import com.epam.jdi.uitests.web.selenium.elements.actions.ActionScenrios;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.settings.WebSettings;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import com.epam.web.matcher.verify.Verify;
import epam.course.pageobjects.SearchField;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static com.epam.jdi.uitests.core.settings.JDISettings.logger;
import static com.epam.jdi.uitests.web.settings.WebSettings.getDriver;
import static java.lang.String.format;

/**
 * Created by Rita on 16.11.2016.
 */
public class InitTests extends TestNGBase {

    private static long totalTime = 0, numOfActions = 0;

    @BeforeSuite(alwaysRun = true)
    public static void setUp() {


        MapInterfaceToElement.update(
                new Object[][] {
                        {ISearch.class, SearchField.class}
                }
        );

        //JDISettings.driverFactory.setCurrentDriver(System.getProperty("driver"));
        WebSettings.useDriver(System.getProperty("driver"));


        ActionScenrios.actionScenario = (element, actionName, jAction, level) -> {
            Timer time = new Timer();
            long actionTime = time.timePassedInMSec();
            jAction.invoke();
            numOfActions ++;
            totalTime += actionTime;
        };

        ActionScenrios.resultScenario = (element, actionName, jAction, logResult, level) -> {
            Object result = jAction.get();
            if (actionName.contains("element")) {
                logger.info(format(actionName.concat(" '%s'"), element.getVarName()));
            } else logger.info(actionName, result);
            return result;
        };

            WebSite.init(JDISite.class);
        Verify.getFails();
    }

    @AfterSuite
    public void tearDown() throws Exception {
        logger.info(format("The average time of %d actions is %.1f s", numOfActions, (double)(totalTime/(numOfActions*1000))));
        getDriver().quit();
    }

}
