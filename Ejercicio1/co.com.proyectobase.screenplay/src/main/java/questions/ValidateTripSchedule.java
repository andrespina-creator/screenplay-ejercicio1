package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterface.LoginPageUI;
import userinterface.SpaceAdvisorPageUI;

public class ValidateTripSchedule implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return SpaceAdvisorPageUI.TRIP_SCHEDULE.resolveFor(actor).getText();
    }

    public static Question<String> text() {
        return new ValidateTripSchedule();

    }

}
