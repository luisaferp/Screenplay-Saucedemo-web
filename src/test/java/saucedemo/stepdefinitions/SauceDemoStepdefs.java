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
import saucedemo.task.Formulario;
import saucedemo.task.Login;
import saucedemo.task.OpenUp;
import saucedemo.task.Seleccion;

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
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarIngreo.thePage(), Matchers.equalTo("Products")));
    }
    @When("selecciono el producto para luego ir al carrito")
    public void seleccionoElProductoParaLuegoIrAlCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(Seleccion.theProduct());


    }
    @When("diligencio el formulario de compra")
    public void diligencioElFormularioDeCompra() {
        OnStage.theActorInTheSpotlight().attemptsTo(Formulario.fillForm());

    }
    @Then("Verifico la compra")
    public void verificoLaCompra() {

    }


    }
