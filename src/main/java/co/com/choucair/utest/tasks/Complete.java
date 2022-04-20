package co.com.choucair.utest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.choucair.utest.userinterface.LocatorTheComplete.*;



public class Complete implements Task {


    public static Complete deviceInformation() {
        return Tasks.instrumented(Complete.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Scroll.to(NEXT_LAST_STEP),
                Click.on(COMPUTER_CLIC),
                Click.on(COMPUTER),
                Click.on(VERSION_CLIC),
                Click.on(VERSION),
                Click.on(LANGUAGE_CLIC),
                Click.on(LANGUAGE),
                Click.on(MOBILE_CLIC),
                Click.on(MOBILE),
                Click.on(MODEL_CLIC),
                Click.on(MODEL),
                Click.on(SYSTEM_CLIC),
                Click.on(SYSTEM));

        actor.attemptsTo(Click.on(NEXT_LAST_STEP));

    }
}
