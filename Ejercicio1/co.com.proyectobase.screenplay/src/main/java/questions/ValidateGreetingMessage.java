package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterface.LoginPageUI;

public class ValidateGreetingMessage implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return LoginPageUI.GREETING_MESSAGE.resolveFor(actor).getText();
    }

    public static Question<String> text() {
        return new ValidateGreetingMessage();

    }

}
