package co.com.sofka.stepdefinitions;

import co.com.sofka.Setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.sofka.tasks.CompletefieldTasks.completefieldTasks;
import static co.com.sofka.tasks.OpenTmoTasks.openTmoTasks;
import static co.com.sofka.tasks.ToregisterTasks.toregisterTasks;
import static co.com.sofka.ui.ToregisterUI.BUTTON_REGISTER;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class ToregisterStep extends Setup {

    @Given("El usuario abre la página TMO")
    public void elUsuarioAbreLaPaginaTMO() {
        try{
            actorSetupTheBrowser("TMO");
            theActorInTheSpotlight().wasAbleTo(
                    openTmoTasks()
            );
        }catch (Exception e){
            System.out.printf("errror"+ e.getMessage());
            quitarDriver();
        }
    }

    @When("El usuario hace clic en el enlace de registro")
    public void elUsuarioHaceClicEnElEnlaceDeRegistro() {
        try{
            actorSetupTheBrowser("Diesel");
            theActorInTheSpotlight().wasAbleTo(
                    toregisterTasks()
            );
        }catch (Exception e){
            System.out.printf("errror"+ e.getMessage());
            quitarDriver();
        }

    }

    @And("Completa el formulario de registro con información válida")
    public void completaElFormularioDeRegistroConInformacionValida() {
        try{
            actorSetupTheBrowser("Diesel");
            theActorInTheSpotlight().wasAbleTo(
                    completefieldTasks()
            );
        }catch (Exception e){
            System.out.printf("errror"+ e.getMessage());
            quitarDriver();
        }
    }

    @And("Hace clic en el botón de registro")
    public void haceClicEnElBotonDeRegistro() {
        try{
            actorSetupTheBrowser("Diesel");
            theActorInTheSpotlight().wasAbleTo(
                    Click.on(BUTTON_REGISTER)
            );
        }catch (Exception e){
            System.out.printf("errror"+ e.getMessage());
            quitarDriver();
        }
        
    }

    @Then("El usuario debería ser redirigido a la página de inicio de sesión")
    public void elUsuarioDeberiaSerRedirigidoALaPaginaDeInicioDeSesion() {
    }



}
