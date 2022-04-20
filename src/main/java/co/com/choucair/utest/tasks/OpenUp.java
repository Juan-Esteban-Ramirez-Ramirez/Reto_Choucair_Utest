package co.com.choucair.utest.tasks;

import co.com.choucair.utest.userinterface.LocatorTheStart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


public class OpenUp implements Task {

    LocatorTheStart openPagWeb;

    public static OpenUp thePage() {

        return Tasks.instrumented(OpenUp.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(openPagWeb));

    }
}
