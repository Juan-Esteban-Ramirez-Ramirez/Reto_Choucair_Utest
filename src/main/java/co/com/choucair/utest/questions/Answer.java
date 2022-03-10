package co.com.choucair.utest.questions;

import co.com.choucair.utest.model.UtestData;
import co.com.choucair.utest.userinterface.MapCreate;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Answer implements Question<String> {

    private List<UtestData> utestData;

    public Answer(List<UtestData> utestData) {
        this.utestData = utestData;
    }

    public static Answer verify(List<UtestData> utestData) {
        return new Answer(utestData);
    }


    @Override
    public String answeredBy(Actor actor) {
        return Text.of(MapCreate.USER_OK).viewedBy(actor).asString();
    }
}
