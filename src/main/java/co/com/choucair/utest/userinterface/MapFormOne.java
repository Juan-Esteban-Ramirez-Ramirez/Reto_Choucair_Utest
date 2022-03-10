package co.com.choucair.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MapFormOne extends PageObject {

    public static final Target FIRST_NAME = Target.the("Ingresar el nombre").located(By.xpath("//input[@id='firstName']"));
    public static final Target lAST_NAME = Target.the("Ingresar apellido").located(By.xpath("//input[@id='lastName']"));
    public static final Target EMAIL = Target.the("Ingresar email").located(By.xpath("//input[@id='email']"));
    public static final Target MONTH = Target.the("Seleccionar mes de nacimiento").located(By.xpath("//select[@id='birthMonth']"));
    public static final Target DAY = Target.the("Seleccionar día de nacimiento").located(By.xpath("//select[@id='birthDay']"));
    public static final Target YEAR = Target.the("Seleccionar año de nacimiento").located(By.xpath("//select[@id='birthYear']"));
    public static final Target NEXT_LOCATION = Target.the("Clic en el boton next location").located(By.xpath("//a[@class='btn btn-blue']"));



}


