package co.com.choucair.utest.tasks;

import co.com.choucair.utest.interactions.Generate;
import co.com.choucair.utest.model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;


import java.util.List;

import static co.com.choucair.utest.userinterface.LocatorTheDefine.*;



public class Define implements Task {

    private List<UtestData> utestData;

    public Define(List<UtestData> utestData) {
        this.utestData = utestData;
    }

    public static Define personalInformation(List<UtestData> utestData) {

        return Tasks.instrumented(Define.class, utestData);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Scroll.to(NEXT_LOCATION),
                Enter.theValue(utestData.get(0).getFirstName()).into(FIRST_NAME),
                Enter.theValue(utestData.get(0).getLastName()).into(lAST_NAME),
                Enter.theValue(Generate.randomEmail(utestData)).into(EMAIL),
                Click.on(MONTH),
                Click.on(DAY),
                Click.on(YEAR),
                Click.on(NEXT_LOCATION));


    }
}
