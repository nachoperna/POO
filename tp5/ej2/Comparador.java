package ej2;

import java.util.Comparator;

public class Comparador implements Comparator<Transporte> {
    private int discernible = 1;

    public Comparador() {

    }

    public Comparador(int x) {
        discernible = x;
    }

    @Override
    public int compare(Transporte o1, Transporte o2) {
        return discernible * (o1.comparar(o1, o2));
    }

}