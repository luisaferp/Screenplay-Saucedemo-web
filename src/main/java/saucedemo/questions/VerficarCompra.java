package saucedemo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import saucedemo.userinterface.SaucedemoFormulario;

public class VerficarCompra implements Question {
    public static VerficarCompra chaquet() {
        return new VerficarCompra();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(SaucedemoFormulario.LBL_COMPRA).answeredBy(actor);
    }


}
