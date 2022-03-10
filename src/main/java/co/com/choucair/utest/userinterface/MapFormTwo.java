package co.com.choucair.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MapFormTwo extends PageObject {

    public static final Target CITY = Target.the("Ingresar la ciudad").located(By.xpath("//input[@id='city']"));
    public static final Target POSTAL = Target.the("Ingresar codigo postal").located(By.xpath("//input[@id='zip']"));
    public static final Target COUNTRY_CLIC = Target.the("Clic en pais").located(By.xpath("(//div[@class='ui-select-match'])[2]"));
    public static final Target COUNTRY = Target.the("ingresar pais").located(By.xpath("//div[contains(text(),'Colombia')]"));
    public static final Target NEXT_DEVICES = Target.the("Clic en next devices").located(By.xpath("//a[@class='btn btn-blue pull-right']"));

}




