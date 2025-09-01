package stepdefinitions.card;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.CategorizeaAPlanet;
import userinterface.SpaceAdvisorHomePage;

public class CardDeploymentStepDefinition {

    @Managed(driver = "chrome")
    WebDriver browser;

    Actor actor = Actor.named("Alan");

    @Given("the user open application Space Advisor with the test id: {string}")
    public void theUserOpenApplicationSpaceAdvisorWithTheTestId(String id) {
        actor.can(BrowseTheWeb.with(browser));
        actor.attemptsTo(Open.browserOn().the(new SpaceAdvisorHomePage()));
    }


    @When("the user selects the {string} and the {string}")
    public void theUserSelectsTheAndThe(String arg0, String arg1) {
        actor.attemptsTo(
                CategorizeaAPlanet.withDescription("a","blue")
        );
    }

    @When("the user selects a card")
    public void theUserSelectsACard() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("the checkout screen shows out")
    public void theCheckoutScreenShowsOut() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
