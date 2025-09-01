package stepdefinitions.destination;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import questions.ValidateTripSchedule;
import tasks.ScheduleJourney;
import userinterface.SpaceAdvisorHomePage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;


public class SelectDestinationStepDefinition {

    @Managed(driver = "chrome")
    WebDriver browser;

    Actor actor = Actor.named("Alan");

    @Given("the user open application SA")
    public void theUserOpenApplicationSA() {
        actor.can(BrowseTheWeb.with(browser));
        actor.attemptsTo(Open.browserOn().the(new SpaceAdvisorHomePage()));
    }

    @When("the user sets the trip date at the {string} day, {string} day, with {string} adults and {string} kids")
    public void theUserSetsTheTripDateAtTheDayDayWithAdultsAndKids(String startDate, String finishDate, String adultCount, String childrenCount) {
        actor.attemptsTo(
                ScheduleJourney.inPage(startDate,finishDate, adultCount, childrenCount)
        );
    }

    @Then("the user can see the trip info {string} day, {string} month, {string} day,{string} month, with {string} adults and {string} kids")
    public void theUserCanSeeTheTripInfoDayMonthDayMonthWithAdultsAndKids(String startDate, String startMonth, String finishDate, String finishMonth, String adultCount, String childrenCount) {
        int totalAdults = Integer.parseInt(adultCount);
        int totalChildren = Integer.parseInt(childrenCount);
        int totalTravelers = totalChildren + totalAdults;

        actor.should(
                seeThat("The trip schedule",
                        ValidateTripSchedule.text(),
                        equalTo(totalTravelers + " travelers, " + startMonth + " " + startDate + " – " + finishMonth + " " + finishDate))
        );
    }
}
