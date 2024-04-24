package saucedemo.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import saucedemo.questions.VerificarIngreo;
import saucedemo.task.Login;
import saucedemo.task.OpenUp;

public class SauceDemoStepdefs {
    @Before
    public void setStage () {OnStage.setTheStage(new OnlineCast());}

    @Given("que luisa ingresa a saucedemo")
    public void queLuisaIngresaASaucedemo() { OnStage.theActorCalled("luisa").wasAbleTo(OpenUp.thepage());
    }

    @When("inicia sesion")
    public void iniciaSesion() { OnStage.theActorInTheSpotlight().attemptsTo(Login.onThePage());
    }

    @Then("Verifico que inicio correctamente")
    public void verificoQueInicioCorrectamente() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarIngreo.thePage(), Matchers.equalTo("PRODUCT")));
    }
}
