package dianafriptuleac.u5w3d3designpatterns.chainOfResponsibility;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Ufficiale {
    protected Ufficiale ufficiale;

    public abstract double getStipendio();

    public void verifyStipendio(double stipendio) {
        if (getStipendio() >= stipendio) {
            System.out.println(getClass().getSimpleName() + " percepisce uno stipendio di " + getStipendio());
        } else if (ufficiale != null) {
            ufficiale.verifyStipendio(stipendio);
        } else {
            System.out.println("Non ci sono ufficiali con lo stipendio di: " + stipendio);
        }
    }
}

