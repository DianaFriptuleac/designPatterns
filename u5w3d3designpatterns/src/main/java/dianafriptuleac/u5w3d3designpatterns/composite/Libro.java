package dianafriptuleac.u5w3d3designpatterns.composite;


import lombok.Getter;

import java.util.List;


public class Libro {
    @Getter
    private List<Autore> autori;
    @Getter
    private double prezzo;
    private LibroComponent libroComponent;
    @Getter
    private String titolo;

    public Libro(List<Autore> autori, double prezzo, LibroComponent libroComponent, String titolo) {
        this.titolo = titolo;
        this.autori = autori;
        this.prezzo = prezzo;
        this.libroComponent = libroComponent;
    }

    public int getNrTotPag() {
        return libroComponent.getNrPagine();
    }

    public void printIntLibro() {
        System.out.println("Stampa dell'intero libro: ");
        libroComponent.print();
    }

    public void printAutori() {
        System.out.println("Autori del libro: ");
        for (Autore autore : autori) {
            System.out.println(autore);
        }
    }

}
