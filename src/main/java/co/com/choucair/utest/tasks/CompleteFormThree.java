package co.com.choucair.utest.tasks;

import co.com.choucair.utest.userinterface.MapFormThree;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class CompleteFormThree implements Task {


    public static CompleteFormThree formThree() {
        return Tasks.instrumented(CompleteFormThree.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Scroll.to(MapFormThree.NEXT_LAST_STEP),
                Click.on(MapFormThree.COMPUTER_CLIC),
                Click.on(MapFormThree.COMPUTER),
                Click.on(MapFormThree.VERSION_CLIC),
                Click.on(MapFormThree.VERSION),
                Click.on(MapFormThree.LANGUAGE_CLIC),
                Click.on(MapFormThree.LANGUAGE),
                Click.on(MapFormThree.MOBILE_CLIC),
                Click.on(MapFormThree.MOBILE),
                Click.on(MapFormThree.MODEL_CLIC),
                Click.on(MapFormThree.MODEL),
                Click.on(MapFormThree.SYSTEM_CLIC),
                Click.on(MapFormThree.SYSTEM));

        actor.attemptsTo(Click.on(MapFormThree.NEXT_LAST_STEP));

    }
}
