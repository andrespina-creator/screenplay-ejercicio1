package tasks;

import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.WebElement;

import java.util.Random;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterface.CalendarUI.*;
import static userinterface.SpaceAdvisorPageUI.*;

public class ScheduleJourney implements Task {

    private final String startDate;
    private final String finishDate;
    private final String adultCount;
    private final String childrenCount;

    public ScheduleJourney(String startDate, String finishDate, String adultCount, String childrenCount) {
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.adultCount = adultCount;
        this.childrenCount = childrenCount;
    }

    public static ScheduleJourney inPage(String startDate, String finishDate, String adultCount, String childrenCount) {
        return instrumented(ScheduleJourney.class, startDate, finishDate, adultCount, childrenCount);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(DEPARTING_SELECT),
                Click.on(YEARS_BTN),
                Click.on(YEAR_SELECT),
                Click.on(MONTHS_BTN),
                Click.on(RIGHT_BTN),
                Click.on(CALENDAR_DAYS(startDate)),
                Click.on(OK_BTN),

                Click.on(RETURNING_SELECT),
                Click.on(YEARS_BTN),
                Click.on(YEAR_SELECT),
                Click.on(MONTHS_BTN),
                Click.on(RIGHT_BTN),
                Click.on(RIGHT_BTN),
                Click.on(CALENDAR_DAYS(finishDate)),
                Click.on(OK_BTN),

                Click.on(ADULTS_DROPDOWN),
                Click.on(ADULTS_OPTION(adultCount)),
                Click.on(CHILDREN_DROPDOWN),
                Click.on(CHILDREN_OPTION(childrenCount)),
                Click.on(SELECT_DESTINATION_BTN)
        );

    }
}
