package dianafriptuleac.u5w3d3designpatterns.chainOfResponsibility;

public class Colonello extends Ufficiale {
    public Colonello(Ufficiale ufficiale) {
        super(ufficiale);
    }

    @Override
    public double getStipendio() {
        return 4000;
    }
}