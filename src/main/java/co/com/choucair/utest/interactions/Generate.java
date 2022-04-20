package co.com.choucair.utest.interactions;


import co.com.choucair.utest.model.UtestData;


import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Generate {


    public static String randomEmail(List<UtestData> utestData){

        int aleatorio = ThreadLocalRandom.current().nextInt();

        String correo = aleatorio + utestData.get(0).getEmail();

        return correo;


    }
}
