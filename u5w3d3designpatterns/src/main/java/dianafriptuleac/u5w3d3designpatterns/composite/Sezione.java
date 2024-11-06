package dianafriptuleac.u5w3d3designpatterns.composite;

import java.util.ArrayList;
import java.util.List;


public class Sezione implements LibroComponent {
    private String titolo;
    private List<LibroComponent> sottosezioni;

    public Sezione(String titolo) {
        this.titolo = titolo;
        this.sottosezioni = new ArrayList<>();
    }

    public void addComponent(LibroComponent component) {
        sottosezioni.add(component);
    }


    @Override
    public int getNrPagine() {
        int nrPagine = 0;
        for (LibroComponent component : sottosezioni) {
            nrPagine += component.getNrPagine();
        }
        return nrPagine;
    }

    @Override
    public void print() {
        System.out.println("Il titolo della sezione: " + titolo + " con: " + getNrPagine() + " pagine");
        for (LibroComponent component : sottosezioni) {
            component.print();
        }
    }
}
