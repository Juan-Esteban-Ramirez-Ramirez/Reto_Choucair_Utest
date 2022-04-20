package co.com.choucair.utest.questions;

import co.com.choucair.utest.model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static co.com.choucair.utest.userinterface.LocatorTheCreate.*;



public class Validate implements Question<Boolean> {

    private List<UtestData> utestData;

    public Validate(List<UtestData> utestData) {
        this.utestData = utestData;
    }

    public static Validate theResults(List<UtestData> utestData) {
        return new Validate(utestData);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultado;

        String usuarioNew = Text.of(USER_OK).viewedBy(actor).asString();

        if (utestData.get(0).getConfirm().equals(usuarioNew)){
            resultado = true;
        }else {
            resultado = false;
        }

        return resultado;

    }
}
