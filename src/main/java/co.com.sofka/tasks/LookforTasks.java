package co.com.sofka.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.com.sofka.ui.LookforUI.BUSCAR;


public class LookforTasks implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(BUSCAR),
                Enter.theValue("MANGA").into(BUSCAR)


        );
    }

    public static LookforTasks lookforTasks() {
        return new LookforTasks();
    }
}
