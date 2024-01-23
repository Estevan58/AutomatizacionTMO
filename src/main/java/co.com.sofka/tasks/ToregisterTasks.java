package co.com.sofka.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;




import static co.com.sofka.ui.ToregisterUI.*;

public class ToregisterTasks implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(REGISTRAR)

        );
    }




    public static ToregisterTasks toregisterTasks() {
        return new ToregisterTasks();
    }
}
