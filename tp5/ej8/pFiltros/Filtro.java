package ej8.pFiltros;

import ej8.Pelicula;

public abstract class Filtro implements Comparable<Pelicula> {
    String palabra;

    public Filtro(String pal) {
        palabra = pal;
    }

    @Override
    public abstract int compareTo(Pelicula p);

}
