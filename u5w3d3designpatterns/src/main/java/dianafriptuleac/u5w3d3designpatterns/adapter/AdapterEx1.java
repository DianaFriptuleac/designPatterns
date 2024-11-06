package dianafriptuleac.u5w3d3designpatterns.adapter;

import lombok.AllArgsConstructor;

import java.util.Calendar;
import java.util.Date;

@AllArgsConstructor
public class AdapterEx1 implements DataSource {
    //AdapterEx1 prende l'istanza di Info nel costruttore come privato cosi Info e accessibile nei metodi.
    private Info info;

    //Concateno nome e cognome
    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    //Calcolo eta in base alla dataNascita e la data attuale usando classe Calendar
    @Override
    public int getEta() {
        Date dataNascita = info.getDataDiNascita();
        if (dataNascita == null)
            return 0;

        //istanza Calendar per la data di nascita
        Calendar dNascita = Calendar.getInstance();
        dNascita.setTime(dataNascita);

        //Istanza Calendar per la data di oggi
        Calendar today = Calendar.getInstance();

        //Calcolo l'eta
        int etaUser = today.get(Calendar.YEAR) - dNascita.get(Calendar.YEAR);
        //  se il giorno dell'anno attuale e < a quello della nascita - restituise 1
        if (today.get(Calendar.DAY_OF_YEAR) < dNascita.get(Calendar.DAY_OF_YEAR)) {
            etaUser--;
        }
        return etaUser;
    }
}
