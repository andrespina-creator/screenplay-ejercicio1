package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.ArrayList;
import java.util.List;

import static userinterface.LoginPageUI.PASSWORD_ERROR_MESSAGE;
import static userinterface.LoginPageUI.USER_ERROR_MESSAGE;

public class ValidateLoginErrorMessage implements Question<List<String>> {
    private final String testType;

    public ValidateLoginErrorMessage(String testType) {
        this.testType = testType;
    }

    @Override
    public List<String> answeredBy(Actor actor) {
        List<String> messages = new ArrayList<>();

        switch (testType.toLowerCase()) {
            case "1":
                messages.add(USER_ERROR_MESSAGE.resolveFor(actor).getText());
                break;

            case "2":
                messages.add(PASSWORD_ERROR_MESSAGE.resolveFor(actor).getText());
                break;

            case "3":
                messages.add(USER_ERROR_MESSAGE.resolveFor(actor).getText());
                messages.add(PASSWORD_ERROR_MESSAGE.resolveFor(actor).getText());
                break;

            default:
                throw new IllegalArgumentException("TestType no soportado: " + testType);
        }

        return messages;
    }

    public static ValidateLoginErrorMessage forType(String testType) {
        return new ValidateLoginErrorMessage(testType);
    }
}
