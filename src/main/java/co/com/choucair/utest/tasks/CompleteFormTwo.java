package co.com.choucair.utest.tasks;

import co.com.choucair.utest.model.UtestData;
import co.com.choucair.utest.userinterface.MapFormTwo;
import co.com.choucair.utest.util.MetTime;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;

import java.util.List;

public class CompleteFormTwo implements Task {

    private List<UtestData> utestData;

    public CompleteFormTwo(List<UtestData> utestData) {
        this.utestData = utestData;
    }


    public static CompleteFormTwo formTwo(List<UtestData> utestData) {

        return Tasks.instrumented(CompleteFormTwo.class, utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Scroll.to(MapFormTwo.NEXT_DEVICES),
                Enter.theValue(utestData.get(0).getCity()).into(MapFormTwo.CITY),
                Hit.the(Keys.ARROW_DOWN).into(MapFormTwo.CITY),
                Hit.the(Keys.ENTER).into(MapFormTwo.CITY),
                Enter.theValue(utestData.get(0).getPostal()).into(MapFormTwo.POSTAL),
                Click.on(MapFormTwo.COUNTRY_CLIC),
                Click.on(MapFormTwo.COUNTRY));
        MetTime.time(2000);
        actor.attemptsTo(Click.on(MapFormTwo.NEXT_DEVICES));




    }
}
