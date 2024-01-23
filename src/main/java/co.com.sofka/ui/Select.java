package co.com.newsofka.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class Select extends PageObject {
        public static final Target INPUT_EMAIL = Target
            .the("Email")
            .located(By.xpath("//*[@id='email']")
            );
    public static final Target INPUT_PASSWORD= Target
            .the("password")
            .located(By.xpath("//*[@id='password']")
            );
    public static final Target BUTTON_ACCEDER = Target
            .the("Acceder")
            .located(By.xpath("//a[contains(text(), 'Acceder')]")
            );


    public static final Target BUTTON_INICIAR_SESION = Target
            .the("Iniciar sesion")
            .located(By.xpath("//*[@id=\"app\"]/main/div/div/div/div[1]/form/div[4]/div[1]/button")
            );
}
