package dianafriptuleac.u5w3d3designpatterns.chainOfResponsibility;

public class Maggiore extends Ufficiale {
    public Maggiore(Ufficiale ufficiale) {
        super(ufficiale);
    }

    @Override
    public double getStipendio() {
        return 3000;
    }
}