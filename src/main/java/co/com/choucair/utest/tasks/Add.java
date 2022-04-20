package co.com.choucair.utest.tasks;

import co.com.choucair.utest.model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.utest.userinterface.LocatorTheAdd.*;



public class Add implements Task {

    private List<UtestData> utestData;

    public Add(List<UtestData> utestData) {
        this.utestData = utestData;
    }


    public static Add geographicLocationData(List<UtestData> utestData) {

        return Tasks.instrumented(Add.class, utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Scroll.to(NEXT_DEVICES),
                Enter.theValue(utestData.get(0).getCity()).into(CITY),
                Hit.the(Keys.ARROW_DOWN).into(CITY),
                Hit.the(Keys.ENTER).into(CITY),
                Enter.theValue(utestData.get(0).getPostal()).into(POSTAL),
                Click.on(COUNTRY_CLIC),
                Click.on(COUNTRY),
                Click.on(NEXT_DEVICES));




    }
}
