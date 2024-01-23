package co.com.sofka.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LookforUI extends PageObject {
    public static final Target BUSCAR = Target
            .the("BUSCAR")
            .located(By.name("title"));

    public static final Target MANGA = Target
            .the("MANGA")
            .located(By.xpath("//span[contains(text(), 'MANGA')]"));
}
