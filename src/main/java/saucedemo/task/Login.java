package saucedemo.task;

import net.bytebuddy.asm.Advice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import saucedemo.userinterface.SaucedemoLogin;

public class Login implements Task {
    private SaucedemoLogin saucedemoLogin;

    public static  Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        Enter.theValue("standard_user").into(SaucedemoLogin.TXT_USUARIO),
                Enter.theValue("secret_sauce").into(SaucedemoLogin.TXT_CONTRASENA),
                Click.on(SaucedemoLogin.BTN_LOG_IN)

                );
    }
}
