package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SpaceAdvisorPageUI {

    public static final Target DEPARTING_SELECT =
            Target.the("departing date selector")
                    .located(By.xpath("//*[@id='app']/div/section[1]/div[3]/div/div[1]/div/div"));

    public static final Target RETURNING_SELECT = Target.the("returning date selector")
            .located(By.xpath("//*[@id='app']/div/section[1]/div[3]/div/div[2]/div/div/input"));

    public static final Target ADULTS_DROPDOWN = Target.the("adults dropdown")
            .locatedBy("//input[@role='input' and contains(@value,'Adults')]");

    public static Target ADULTS_OPTION(String value) {
        return Target.the("adult option " + value)
                .locatedBy("//*[@id='app']/div/section[1]/div[3]/div/div[3]/ul/li[.='{0}']")
                .of(value);
    }

    public static final Target CHILDREN_DROPDOWN = Target.the("children dropdown")
            .locatedBy("//input[@role='input' and contains(@value,'Children')]");

    public static Target CHILDREN_OPTION(String value) {
        return Target.the("children option " + value)
                .locatedBy("/html/body/div/div/section[1]/div[3]/div/div[4]/ul/li[.='{0}']")
                .of(value);
    }

    public static final Target SELECT_DESTINATION_BTN = Target.the("select destination button")
            .located(By.xpath("//*[@id='app']/div/section[1]/div[4]/button"));

    public static final Target TRIP_SCHEDULE = Target.the("trip schedule")
            .located(By.xpath("//*[@id=\"app\"]/div/section[2]/div[3]/div/h3"));



    public static final Target LAUNCH_DROPDOWN = Target.the("launch dropdown")
            .locatedBy("//input[@role='input' and contains(@value,'Launch')]");

    public static final Target PLANET_COLOR_DROPDOWN = Target.the("planet color dropdown")
            .locatedBy("//input[@role='input' and contains(@value,'Planet color')]");

    public static final Target BOOK_BTN = Target.the("book button")
            .locatedBy("//button[contains(.,'Book')]");

}