package saucedemo.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import saucedemo.userinterface.SaucedemoLogin;

public class Seleccion implements Task {
    private SaucedemoLogin saucedemoLogin;

    public static  Seleccion theProduct() {
        return Tasks.instrumented(Seleccion.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SaucedemoLogin.BTN_PRODUCT),
                Click.on(SaucedemoLogin.BTN_CHECKOUT),
                Click.on(SaucedemoLogin.BTN_CECKOUT)




        );
    }
}
