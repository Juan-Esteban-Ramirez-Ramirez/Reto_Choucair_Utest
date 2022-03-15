package co.com.choucair.utest.tasks;


import co.com.choucair.utest.model.UtestData;
import co.com.choucair.utest.userinterface.MapCreate;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.List;

public class Create implements Task {

    private List<UtestData> utestData;

    public Create(List<UtestData> utestData) {
        this.utestData = utestData;
    }


    public static Create valid(List<UtestData> utestData) {
        return Tasks.instrumented(Create.class, utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Scroll.to(MapCreate.SCROLL),
                Enter.theValue(utestData.get(0).getCreateKey()).into(MapCreate.PASSWORD),
                Enter.theValue(utestData.get(0).getCreateKey()).into(MapCreate.CONFIRM_PASS),
                Click.on(MapCreate.CHECK_ONE),
                Click.on(MapCreate.CHECK_TWO));




    }
}
