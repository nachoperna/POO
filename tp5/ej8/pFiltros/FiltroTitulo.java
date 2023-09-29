package ej8.pFiltros;

import ej8.Pelicula;

public class FiltroTitulo extends Filtro {

    public FiltroTitulo(String palabra) {
        super(palabra);
    }

    @Override
    public int compareTo(Pelicula p) {
        if (p.getTitulo().contains(palabra)) {
            return 1;
        }
        return -1;
    }

}
