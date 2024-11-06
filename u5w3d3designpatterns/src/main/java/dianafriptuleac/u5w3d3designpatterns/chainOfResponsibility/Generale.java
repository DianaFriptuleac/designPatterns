package dianafriptuleac.u5w3d3designpatterns.chainOfResponsibility;


public class Generale extends Ufficiale {
    public Generale(Ufficiale ufficiale) {
        super(ufficiale);
    }

    @Override
    public double getStipendio() {
        return 5000;
    }
}
