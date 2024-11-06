package dianafriptuleac.u5w3d3designpatterns.composite;

import lombok.AllArgsConstructor;

//Leaf- foglia dell'albero
@AllArgsConstructor
public class Pagina implements LibroComponent {
    private int numero;

    @Override
    public int getNrPagine() {
        return 1;
    }

    @Override
    public void print() {
        System.out.println("Nr. della pagina: " + getNrPagine());
    }
}
