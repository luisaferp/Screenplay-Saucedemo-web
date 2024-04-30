package saucedemo.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SaucedemoFormulario {
    public static final Target TXT_NAME = Target.the("campo name").located(By.id("first-name"));
    public static final Target TXT_LASTNAME = Target.the("campo apellido").located(By.id("last-name"));
    public static final Target TXT_POSTAL = Target.the("codigo postal").located(By.id("postal-code"));
    public static final Target BTN_CONTINUE =Target.the("boton continuar").located(By.id("continue")) ;
    public static final Target BTN_FINISH = Target.the("boton fin").located(By.id("finish"));
}
