package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CalendarUI {

    public static final Target YEARS_BTN = Target.the("years btn")
            .located(By.id("years"));

    public static final Target YEAR_SELECT= Target.the("year selection")
            .located(By.id("2025"));

    public static final Target MONTHS_BTN= Target.the("months btn")
            .located(By.id("months"));

    public static final Target RIGHT_BTN= Target.the("right btn")
            .located(By.id("right"));

    public static Target CALENDAR_DAYS(String day) {
        return Target.the("calendar day " + day)
                .locatedBy("/html/body/div[2]/div/div[2]/section/div/div/div/span/div/div[2]/div[.='{0}']")
                .of(day);
    }

    public static final Target OK_BTN =
            Target.the("ok btn")
                    .located(By.xpath("/html/body/div[2]/div/div[2]/nav/button[2]"));



}
