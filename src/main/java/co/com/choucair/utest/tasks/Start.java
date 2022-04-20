package co.com.choucair.utest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.utest.userinterface.LocatorTheStart.*;



public class Start implements Task {


    public static Start theForms() {

        return Tasks.instrumented(Start.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo( Click.on(JOIN_TODAY));

    }
}
