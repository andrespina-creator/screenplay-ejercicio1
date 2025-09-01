package stepdefinitions.login;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import questions.ValidateGreetingMessage;
import questions.ValidateLoginErrorMessage;
import tasks.Login;
import userinterface.SpaceAdvisorHomePage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.contains;

public class LoginStepDefinition {

    @Managed(driver = "chrome")
    WebDriver browser;

    Actor actor = Actor.named("Alan");

    @Given("the user open application Space Advisor")
    public void theUserOpenApplicationSpaceAdvisor() {
        actor.can(BrowseTheWeb.with(browser));
        actor.attemptsTo(Open.browserOn().the(new SpaceAdvisorHomePage()));
    }

    @When("enter your credentials {string} {string}")
    public void enterYourCredentials(String username, String password) {
        actor.attemptsTo(
                Login.withCredentials(username, password)
        );
    }

    @Then("the user valid your name in home page")
    public void theUserValidYourNameInHomePage() {
        actor.should(
                seeThat("The greeting message",
                        ValidateGreetingMessage.text(),
                        equalTo("HELLO, JOHN"))
        );

    }

    @Then("the user observes {string} error with messages {string}")
    public void theUserObservesErrorWithMessages(String testType, String expectedMessages) {
        String[] expectedArray = expectedMessages.split(",");

        actor.should(
                seeThat("Error test type: " + testType,
                        ValidateLoginErrorMessage.forType(testType),
                        contains(expectedArray))
        );
    }
}
