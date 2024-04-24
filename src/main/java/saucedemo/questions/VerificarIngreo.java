package saucedemo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import saucedemo.userinterface.SaucedemoLogin;

public class VerificarIngreo implements Question {

    public static VerificarIngreo thePage() {
        return new VerificarIngreo();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(SaucedemoLogin.LBL_PRODUCTO).answeredBy(actor);
    }
}
