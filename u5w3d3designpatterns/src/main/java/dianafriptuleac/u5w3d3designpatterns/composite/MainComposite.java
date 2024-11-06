package dianafriptuleac.u5w3d3designpatterns.composite;

import java.util.Arrays;
import java.util.List;

public class MainComposite {
    public static void main(String[] args) {
        System.out.println("---------------Esercizio 2 - Composite------------------");

        //Con  Composite posso stampare o prendere il nr tot. di pag per ogni
        // livello (una  pag, sezione o intero libro)

        //creo autori
        Autore a1 = new Autore("Alessio", "Mariani", "Autore italiano -storie per bambini");
        Autore a2 = new Autore("Luca", "Neri", "Autore di lettura contemporanea");

        //Lista di autori
        List<Autore> autoril1 = Arrays.asList(a1, a2);

        //creo le pagine
        Pagina p1 = new Pagina(1);
        Pagina p2 = new Pagina(2);
        Pagina p3 = new Pagina(3);
        Pagina p4 = new Pagina(4);
        Pagina p5 = new Pagina(5);

        //creo sezioni
        Sezione sIniziale = new Sezione("Introduzione");
        sIniziale.addComponent(p1);
        sIniziale.addComponent(p2);

        Sezione sPrincipale = new Sezione("Capitolo 1");
        sPrincipale.addComponent(p3);
        sPrincipale.addComponent(p4);
        sPrincipale.addComponent(p5);

        // creo libro con una sezione principale +  sottosezioni
        Sezione sezionePrincipale = new Sezione("Libro Completo");
        sezionePrincipale.addComponent(sIniziale);
        sezionePrincipale.addComponent(sPrincipale);

        Libro l1 = new Libro(autoril1, 25.50, sezionePrincipale, "Il Grande Libro delle Storie");

        System.out.println("Nr. pagine libro: " + l1.getNrTotPag());
        l1.printAutori();
        l1.printIntLibro();
    }
}
