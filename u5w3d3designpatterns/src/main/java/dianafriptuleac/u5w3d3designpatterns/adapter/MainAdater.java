package dianafriptuleac.u5w3d3designpatterns.adapter;

import java.util.Calendar;
import java.util.Date;

public class MainAdater {
    public static void main(String[] args) {
        System.out.println("---------------Esercizio 1 - Adapter------------------");

        //Istanza cal per data di nascita
        Calendar cal = Calendar.getInstance();
        cal.set(1993, Calendar.OCTOBER, 3);
        //Converto Calendar in Date
        Date dataNascita = cal.getTime();
        //Creo user(oggetto Indo)
        Info info = new Info(" Anna", "Neri", dataNascita);
        //Con adapter rendo compatibili i metodi di Info con UserData
        AdapterEx1 ad1 = new AdapterEx1(info);
        UserData userData1 = new UserData();
        //UserData ottiene i dati da Info tramite adapter
        userData1.getData(ad1);
        System.out.println(userData1);
    }
}
