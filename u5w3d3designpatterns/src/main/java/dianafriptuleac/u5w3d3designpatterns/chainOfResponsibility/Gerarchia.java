package dianafriptuleac.u5w3d3designpatterns.chainOfResponsibility;

public class Gerarchia {
    public static Ufficiale createGerarchia() {
        Ufficiale generale = new Generale(null);
        Ufficiale colonello = new Colonello(generale);
        Ufficiale maggiore = new Maggiore(colonello);
        Ufficiale capitano = new Capitano(maggiore);
        Ufficiale tenente = new Tenente(capitano);
        return tenente;
    }
}
