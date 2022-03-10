package co.com.choucair.utest.util;

public class MetTime {

    public static void time (int seg){

        try{
            Thread.sleep(seg);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
