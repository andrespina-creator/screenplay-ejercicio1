package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CardsScreenUI {

    public static final Target LAUNCH_DROPDOWN = Target.the("launch dropdown")
            .located(By.xpath("//*[@id=\"app\"]/div/section[2]/div[3]/div/div/div[1]/div/input"));

    public static Target LAUNCH_OPTION(String launchPlace) {
        return Target.the("launch dropdown option with text " + launchPlace)
                .located(By.xpath("//*[@id='app']/div/section[2]/div[3]/div/div/div[1]/ul/li[contains(normalize-space(text()),'" + launchPlace + "')]"));
    }

    public static final Target COLOR_DROPDOWN = Target.the("color dropdown")
                .located(By.xpath("//*[@id=\"app\"]/div/section[2]/div[3]/div/div/div[2]/div/input"));

    public static Target COLOR_OPTION(String color) {
        return Target.the("color option")
                  .located(By.xpath("//*[@id=\"app\"]/div/section[2]/div[3]/div/div/div[2]/ul/li[contains(normalize-space(text()),'" + color + "')]"));
    }

    public static final Target SLIDER = Target.the("slider de cantidad")
            .located(By.xpath("//*[@id=\"app\"]/div/section[2]/div[3]/div/div/div[3]/div[2]/div[2]/input"));

    public static final Target LOAD_MORE_BTN = Target.the("load more btn")
            .located(By.className("theme__button___1iKuo CTAButton__button___2nXRo theme__raised___ONZv6 CTAButton__raised___1nGcA theme__primary___2NhN1 CTAButton__primary___WQCBB Gallery__cta-button___3kPlJ"));

}
