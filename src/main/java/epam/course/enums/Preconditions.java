package epam.course.enums;

import com.epam.commons.linqinterfaces.JAction;
import com.epam.jdi.uitests.web.selenium.preconditions.WebPreconditions;
import epam.course.entities.User;

import java.util.function.Supplier;

import static epam.course.JDISite.*;

/**
 * Created by Rita on 23.11.2016.
 */
public enum Preconditions implements WebPreconditions {
    LOGGED_IN(
            () -> logout.isDisplayed(),
            () -> {
                homePage.isOpened();
                login.submit(new User(true, "epam", "1234"));
            }
    ),
    LOGGED_OUT(
            () -> login.isDisplayed(),
            () -> {
                homePage.isOpened();
                profile.click();
                logout.click();
            }
    );

    public Supplier<Boolean> checkAction;
    public JAction moveToAction;

    Preconditions(Supplier<Boolean> checkAction, JAction moveToAction) {
        this.checkAction = checkAction;
        this.moveToAction = moveToAction;
    }

    public Boolean checkAction() {
        return checkAction.get();
    }

    public void moveToAction() {
        moveToAction.invoke();
    }
}
