package ej8.pFiltros;

import ej8.Pelicula;

public class FiltroAnio implements Comparable<Pelicula> {
    private int estreno;

    public FiltroAnio(int estreno) {
        this.estreno = estreno;
    }

    @Override
    public int compareTo(Pelicula p) {
        if (p.getEstreno() < estreno) {
            return 1;
        }
        return -1;
    }

}
