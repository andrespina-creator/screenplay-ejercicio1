package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/login.feature",
		tags= "@LoginSuccessful",
		glue="stepdefinitions.login",
		snippets= CucumberOptions.SnippetType.CAMELCASE
)
public class LoginSuccessfulRunner {

}
