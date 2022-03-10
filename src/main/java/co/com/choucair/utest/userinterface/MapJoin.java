package co.com.choucair.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://www.utest.com/")
public class MapJoin extends PageObject {

    public static final Target JOIN_TODAY = Target.the("Clic en el botón Join today").located(By.xpath("//a[contains(text(),'Join Today')]"));

}
