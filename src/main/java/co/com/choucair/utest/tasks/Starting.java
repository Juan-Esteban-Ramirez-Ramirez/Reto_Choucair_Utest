package co.com.choucair.utest.tasks;

import co.com.choucair.utest.userinterface.MapJoin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Starting implements Task {

    MapJoin mapJoin;

    public static Starting thePage() {

        return Tasks.instrumented(Starting.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(mapJoin));

    }
}
