package co.com.sofka.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://visortmo.com/")
public class ToregisterUI extends PageObject {
    public static final Target REGISTRAR = Target
            .the("Modulo de registrar")
            .located(By.xpath("//a[contains(text(),'Registrar')]"));


    public static final Target EMAIL = Target
            .the("Input de email")
            .located(By.name("email"));

    public static final Target NICK = Target
            .the("Input nick")
            .located(By.name("username"));

    public static final Target PASSWORD = Target
            .the("Input de password")
            .located(By.name("password"));
    public static final Target REPITY_PASSWORD = Target
            .the("Input de repertir password")
            .located(By.name("password_confirmation"));


    public static final Target ACEPTAR_TERMINOS = Target
            .the("Aceptar terminos")
            .located(By.xpath("//*[@id=\"app\"]/main/div/div/div/div[1]/form/div[5]/div/div"));

    public static final Target CHECKBOX_ROBOT = Target
            .the("CHECKBOX_ROBOT")
            .located(By.xpath("//*[@id='recaptcha-element']/div"));
    public static final Target BUTTON_REGISTER = Target
            .the("Boton de registrar")
            .located(By.xpath("/html/body/div[1]/main/div/div/div/div[1]/form/div[7]/div/button"));

}
