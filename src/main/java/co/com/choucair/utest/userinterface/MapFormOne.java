package co.com.choucair.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MapFormOne extends PageObject {

    public static final Target FIRST_NAME = Target.the("Ingresar el nombre").located(By.xpath("//input[@id='firstName']"));
    public static final Target lAST_NAME = Target.the("Ingresar apellido").located(By.xpath("//input[@id='lastName']"));
    public static final Target EMAIL = Target.the("Ingresar email").located(By.xpath("//input[@id='email']"));
    public static final Target MONTH = Target.the("Clic en el mes de Diciembre").located(By.xpath("//option[contains(text(),'December')]"));
    public static final Target DAY = Target.the("Clic en el dia 24").located(By.xpath("//option[text()='24']"));
    public static final Target YEAR = Target.the("Clic en el año 1992").located(By.xpath("//option[contains(text(),'1992')]"));
    public static final Target NEXT_LOCATION = Target.the("Clic en el boton next location").located(By.xpath("//a[@class='btn btn-blue']"));



}


