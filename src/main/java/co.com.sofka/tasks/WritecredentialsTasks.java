package co.com.sofka.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.newsofka.ui.Select.*;
import static net.serenitybdd.screenplay.actions.Enter.theValue;

public class WritecredentialsTasks implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                theValue("germanestevan58@gmail.com").into(INPUT_EMAIL),
                theValue("Gv12345").into(INPUT_PASSWORD)
        );
    }
    public static WritecredentialsTasks writecredentialsTasks(){
        return new WritecredentialsTasks();
    }
}
