package epam.course.entities;

import com.epam.jdi.uitests.core.interfaces.common.IButton;
import epam.course.enums.EvenRadio;
import epam.course.enums.OddsRadio;

/**
 * Created by Rita on 23.11.2016.
 */
public class Summary {
    public OddsRadio oddsRadio;
    public EvenRadio evenRadio;

    public Summary() {
        this.oddsRadio = OddsRadio.ONE;
        this.evenRadio = EvenRadio.TWO;
    }

    public Summary(OddsRadio oddsRadio, EvenRadio evenRadio) {
        this.oddsRadio = oddsRadio;
        this.evenRadio = evenRadio;
    }

}
