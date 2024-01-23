package co.com.sofka.tasks;

import co.com.sofka.ui.ToregisterUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenTmoTasks implements Task {
    private ToregisterUI toregisterUI;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(toregisterUI)
        );
    }

    public static OpenTmoTasks openTmoTasks() {
        return new OpenTmoTasks();
    }
}
