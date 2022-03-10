package co.com.choucair.utest.tasks;

import co.com.choucair.utest.userinterface.MapJoin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Join implements Task {


    public static Join today() {

        return Tasks.instrumented(Join.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo( Click.on(MapJoin.JOIN_TODAY));

    }
}
