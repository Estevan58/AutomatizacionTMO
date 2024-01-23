package co.com.sofka.stepdefinitions;

import co.com.sofka.Setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.com.newsofka.ui.Select.BUTTON_INICIAR_SESION;
import static co.com.sofka.questions.QuestionLookfor.questionLookfor;
import static co.com.sofka.tasks.ClicAcceder.clicAcceder;
import static co.com.sofka.tasks.LookforTasks.lookforTasks;
import static co.com.sofka.tasks.WritecredentialsTasks.writecredentialsTasks;
import static co.com.sofka.ui.LookforUI.BUSCAR;
import static co.com.sofka.ui.ToregisterUI.BUTTON_REGISTER;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class LookforStep extends Setup {

    @And("Inicia sesión con credenciales válidas")
    public void iniciaSesionConCredencialesValidas() {
        try{
            actorSetupTheBrowser("Buscar");
            theActorInTheSpotlight().wasAbleTo(
                    clicAcceder(),
                    writecredentialsTasks(),
                    Click.on(BUTTON_INICIAR_SESION)
            );
        }catch (Exception e){
            System.out.printf("errror"+ e.getMessage());
            quitarDriver();
        }
    }

    @When("El usuario busca un anime específico en la barra de búsqueda")
    public void elUsuarioBuscaUnAnimeEspecificoEnLaBarraDeBusqueda() {
        try{
            actorSetupTheBrowser("Buscar");
            theActorInTheSpotlight().wasAbleTo(
                    lookforTasks()
            );
        }catch (Exception e){
            System.out.printf("errror"+ e.getMessage());
            quitarDriver();
        }
    }

    @And("Presiona Enter o hace clic en el botón de búsqueda")
    public void presionaEnterOHaceClicEnElBotonDeBusqueda() {
        try{
            actorSetupTheBrowser("Buscar");
            theActorInTheSpotlight().wasAbleTo(
                    Hit.the(Keys.ENTER).into(BUSCAR)
            );
        }catch (Exception e){
            System.out.printf("errror"+ e.getMessage());
            quitarDriver();
        }
    }

    @Then("Deberían mostrar los resultados relacionados con el manga buscado")
    public void deberianMostrarLosResultadosRelacionadosConElMangaBuscado() {
        try{
            theActorInTheSpotlight().should(seeThat("Se debería de aumentar la cantidad a 2",
                    questionLookfor(),equalTo("MANGA"))

            );
        }catch (Exception e){
            System.out.printf("errror"+ e.getMessage());
            quitarDriver();
        }
        quitarDriver();

    }


}
