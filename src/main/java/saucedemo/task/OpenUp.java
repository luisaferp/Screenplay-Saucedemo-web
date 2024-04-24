package saucedemo.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Browser;
import net.serenitybdd.screenplay.actions.Open;
import saucedemo.userinterface.SaucedemoPage;

public class OpenUp implements Task {
    private SaucedemoPage saucedemoPage;
    public static Performable thepage() { return Tasks.instrumented(OpenUp.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(saucedemoPage),
                Browser.maximize());
    }
}
