package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPageUI {

    public static final Target BTN_LOGIN_PAGE = Target.the("Log in page")
            .located(By.className("NavButton__nav-button___34wHC"));

    public static final Target USERNAME_FIELD = Target.the("username field")
            .located(By.xpath("//*[@id='login']/div[1]/input"));

    public static final Target PASSWORD_FIELD = Target.the("password field")
            .located(By.cssSelector("input[type='password']"));

    public static final Target BTN_LOGIN = Target.the("btn log in")
            .located(By.cssSelector("button[type='submit']"));

    public static final Target GREETING_MESSAGE = Target.the("greeting message")
            .located(By.xpath("//*[@id='app']/div/header/div/div[2]/ul/div/button/span[1]"));

    public static final Target USER_ERROR_MESSAGE = Target.the("user log in error")
            .located(By.xpath("//*[@id='login']/div[1]/span[3]"));

    public static final Target PASSWORD_ERROR_MESSAGE = Target.the("password log in error")
            .located(By.xpath("//*[@id=\"login\"]/div[2]/span[3]"));

}



