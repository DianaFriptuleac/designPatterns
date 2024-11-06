package dianafriptuleac.u5w3d3designpatterns.chainOfResponsibility;

//Il Chain of Responsibility permette di passare una richiesta lungo una serie di oggetti - catena
// finche uno di essi non la gestisce.Gli ufficiali sono collegati in
// una catena gerarchica Tenente --> Generale. Ogni ufficiale verifica se

public class MainChainOfResponsibility {
    public static void main(String[] args) {

        Ufficiale tenente = Gerarchia.createGerarchia();

        System.out.println("Verificha quale ufficiale percepisce almeno uno stipendio di 800 euro");
        tenente.verifyStipendio(800);

        System.out.println("Verificha quale ufficiale percepisce almeno uno stipendio di 4400 euro");
        tenente.verifyStipendio(4400);
    }
}
