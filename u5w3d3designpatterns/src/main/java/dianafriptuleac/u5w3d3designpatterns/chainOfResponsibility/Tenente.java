package dianafriptuleac.u5w3d3designpatterns.chainOfResponsibility;

public class Tenente extends Ufficiale {
    public Tenente(Ufficiale ufficiale) {
        super(ufficiale);
    }

    @Override
    public double getStipendio() {
        return 1000;
    }
}
