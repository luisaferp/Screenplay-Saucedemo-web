package saucedemo.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import saucedemo.userinterface.SaucedemoFormulario;

public class Formulario implements Task {
    private SaucedemoFormulario saucedemoFormulario;

    public static Formulario fillForm() {
        return Tasks.instrumented(Formulario.class);
    }




    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Luisa").into(SaucedemoFormulario.TXT_NAME),
                Enter.theValue("Fernandez").into(SaucedemoFormulario.TXT_LASTNAME),
                Enter.theValue("230001").into(SaucedemoFormulario.TXT_POSTAL),
                Click.on(SaucedemoFormulario.BTN_CONTINUE),
                Click.on(SaucedemoFormulario.BTN_FINISH)
        );

    }
}
