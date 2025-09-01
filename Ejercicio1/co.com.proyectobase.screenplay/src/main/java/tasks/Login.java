package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import userinterface.LoginPageUI;

public class Login implements Task {

    private final String user;
    private final String password;

    public Login(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public static Login withCredentials(String user, String password) {
        return instrumented(Login.class, user, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LoginPageUI.BTN_LOGIN_PAGE),
                Enter.theValue(user).into(LoginPageUI.USERNAME_FIELD),
                Enter.theValue(password).into(LoginPageUI.PASSWORD_FIELD),
                Click.on(LoginPageUI.BTN_LOGIN)
        );
    }
}
