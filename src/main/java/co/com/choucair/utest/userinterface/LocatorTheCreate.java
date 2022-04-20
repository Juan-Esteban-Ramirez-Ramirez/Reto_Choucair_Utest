package co.com.choucair.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocatorTheCreate extends PageObject {

    public static final Target PASSWORD = Target.the("Ingresar la contraseña").located(By.xpath("//input[@id='password']"));
    public static final Target CONFIRM_PASS = Target.the("Ingresar nuevamente la contraseña").located(By.xpath("//input[@id='confirmPassword']"));
    public static final Target CHECK_ONE = Target.the("seleccione check box uno").located(By.xpath("//input[@id='termOfUse']"));
    public static final Target CHECK_TWO = Target.the("seleccione check box dos").located(By.xpath("//input[@id='privacySetting']"));
    public static final Target SCROLL = Target.the("Hacer scroll").located(By.xpath("//span[contains(text(),'The last step')]"));
    public static final Target USER_OK = Target.the("text para hacer el asercion").located(By.xpath("//span[contains(text(),'The last step')]"));

}
