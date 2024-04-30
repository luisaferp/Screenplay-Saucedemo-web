package saucedemo.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SaucedemoLogin {
    public static final Target TXT_USUARIO = Target.the("campo usuario").located(By.xpath("//input[@name='user-name']"));
    public static final Target TXT_CONTRASENA = Target.the("campo contrasena").located(By.xpath("//input[@name='password']"));
    public static final Target BTN_LOG_IN = Target.the ("boton login").located(By.id("login-button"));
    public static final Target LBL_PRODUCTO = Target.the("Mensaje").located(By.xpath("//span[contains(text(),'Products')]"));
    public static final Target BTN_PRODUCT = Target.the("eleccion").located(By.id("add-to-cart-sauce-labs-fleece-jacket"));
    public static final Target BTN_CHECKOUT = Target.the("boton compra").located(By.id("shopping_cart_container"));
    public static final Target BTN_CECKOUT = Target.the("boton formulario").located(By.id("checkout"));

}
