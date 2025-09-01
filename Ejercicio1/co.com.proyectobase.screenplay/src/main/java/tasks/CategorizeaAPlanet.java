package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterface.CalendarUI.OK_BTN;
import static userinterface.CardsScreenUI.*;

public class CategorizeaAPlanet implements Task {

    private final String launchPlace;
    private final String planetColor;

    public CategorizeaAPlanet(String launchPlace, String planetColor) {
        this.launchPlace = launchPlace;
        this.planetColor = planetColor;
    }


    public static CategorizeaAPlanet withDescription(String launchPlace, String planetColor) {
        return instrumented(CategorizeaAPlanet.class, launchPlace, planetColor);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
//                Click.on(LAUNCH_DROPDOWN),
//                Click.on(LAUNCH_OPTION("Flagstaff")),
//                Click.on(COLOR_DROPDOWN),
//                Click.on(COLOR_OPTION("Brown")),
                DoubleClick.on(SLIDER).then(Hit.the(Keys.DELETE).into(SLIDER)),
                Enter.theValue("1200").into(SLIDER),
                Click.on(LOAD_MORE_BTN)
        );

    }
}
