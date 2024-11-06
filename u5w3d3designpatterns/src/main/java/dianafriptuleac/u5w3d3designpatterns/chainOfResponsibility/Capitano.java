package dianafriptuleac.u5w3d3designpatterns.chainOfResponsibility;


public class Capitano extends Ufficiale {
    public Capitano(Ufficiale ufficiale) {
        super(ufficiale);
    }

    @Override
    public double getStipendio() {
        return 2000;
    }
}
