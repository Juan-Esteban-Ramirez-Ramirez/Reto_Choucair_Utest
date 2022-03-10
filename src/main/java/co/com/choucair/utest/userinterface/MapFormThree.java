package co.com.choucair.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MapFormThree extends PageObject {

    public static final Target COMPUTER_CLIC = Target.the("clic en computer").located(By.xpath("//div[@name='osId']"));
    public static final Target COMPUTER = Target.the("seleccione computer").located(By.xpath("//div[contains(text(),'Windows')]"));
    public static final Target VERSION_CLIC = Target.the("clic en version").located(By.xpath("//div[@name='osVersionId']"));
    public static final Target VERSION = Target.the("seleccione version").located(By.xpath("//div[contains(text(),'Windows 10 ')]"));
    public static final Target LANGUAGE_CLIC = Target.the("clic en language").located(By.xpath("//div[@name='osLanguageId']"));
    public static final Target LANGUAGE = Target.the("seleccione language").located(By.xpath("//div[contains(text(),'Bulgarian')]"));
    public static final Target MOBILE_CLIC = Target.the("clic en mobile").located(By.xpath("//div[@name='handsetMakerId']"));
    public static final Target MOBILE = Target.the("seleccione mobile").located(By.xpath("//div[contains(text(),'Apple')]"));
    public static final Target MODEL_CLIC = Target.the("clic en model").located(By.xpath("//div[@name='handsetModelId']"));
    public static final Target MODEL = Target.the("seleccione model").located(By.xpath("//div[contains(text(),'iPhone 8 Plus')]"));
    public static final Target SYSTEM_CLIC = Target.the("clic en system").located(By.xpath("//div[@name='handsetOSId']"));
    public static final Target SYSTEM = Target.the("seleccione system").located(By.xpath("//div[contains(text(),'iOS 13')]"));
    public static final Target NEXT_LAST_STEP = Target.the("clic en next last step").located(By.xpath("//a[@class='btn btn-blue pull-right']"));

}


