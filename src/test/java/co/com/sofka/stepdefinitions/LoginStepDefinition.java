package co.com.sofka.stepdefinitions;

import co.com.sofka.Setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.newsofka.ui.Select.BUTTON_INICIAR_SESION;
import static co.com.sofka.tasks.ClicAcceder.clicAcceder;
import static co.com.sofka.tasks.LookforTasks.lookforTasks;
import static co.com.sofka.tasks.WritecredentialsTasks.writecredentialsTasks;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class LoginStepDefinition extends Setup {

    @When("El usuario hace clic en el boton para iniciar sesion")
    public void elUsuarioHaceClicEnElBotonParaIniciarSesion() {
        try{
            actorSetupTheBrowser("Buscar");
            theActorInTheSpotlight().wasAbleTo(
                    clicAcceder()
            );
        }catch (Exception e){
            System.out.printf("errror"+ e.getMessage());
            quitarDriver();
        }
    }

    @And("Ingresa las credenciales de usuario")
    public void ingresaLasCredencialesDeUsuario() {
        try{
            actorSetupTheBrowser("Buscar");
            theActorInTheSpotlight().wasAbleTo(
                    writecredentialsTasks()
            );
        }catch (Exception e){
            System.out.printf("errror"+ e.getMessage());
            quitarDriver();
        }
    }

    @And("Hace clic en el boton para acceder")
    public void haceClicEnElBotonParaAcceder() {
        try{
            actorSetupTheBrowser("Acceder");
            theActorInTheSpotlight().wasAbleTo(
                    Click.on(BUTTON_INICIAR_SESION)
            );
        }catch (Exception e){
            System.out.printf("errror"+ e.getMessage());
            quitarDriver();
        }

    }

    @Then("El usuario debería ser redirigido a la pagina principal")
    public void elUsuarioDeberiaSerRedirigidoALaPaginaPrincipal() {

        quitarDriver();
    }
}
