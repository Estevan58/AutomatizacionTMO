package co.com.sofka.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.newsofka.ui.Select.BUTTON_ACCEDER;


public class ClicAcceder implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_ACCEDER)
        );
    }

    public static ClicAcceder clicAcceder(){
        return new ClicAcceder();
    }
}
