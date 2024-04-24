package saucedemo.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SaucedemoLogin {
    public static final Target TXT_USUARIO = Target.the("campo usuario").located(By.xpath("//input[@name='user-name']"));
    public static final Target TXT_CONTRASENA = Target.the("campo contrasena").located(By.xpath("//input[@name='password']"));
    public static final Target BTN_LOG_IN = Target.the ("boton login").located(By.id("login-button"));
}
