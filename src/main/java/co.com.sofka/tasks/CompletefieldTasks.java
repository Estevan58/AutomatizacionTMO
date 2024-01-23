
package co.com.sofka.tasks;

import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static co.com.sofka.ui.ToregisterUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class CompletefieldTasks implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(EMAIL),
                Enter.theValue("germanestevan58@gmail.com").into(EMAIL),
                Click.on(NICK),
                Enter.theValue("Estevan1912").into(NICK),
                Click.on(PASSWORD),
                Enter.theValue("Gv12345").into(PASSWORD),
                Click.on(REPITY_PASSWORD),
                Enter.theValue("Gv12345").into(REPITY_PASSWORD),
                Hit.the(Keys.TAB).into(REPITY_PASSWORD),
                //Hit.the(Keys.ENTER).into(REPITY_PASSWORD),

                Click.on(ACEPTAR_TERMINOS),
                Click.on(CHECKBOX_ROBOT)
        );
    }

    public static CompletefieldTasks completefieldTasks() {return new CompletefieldTasks();}
}
