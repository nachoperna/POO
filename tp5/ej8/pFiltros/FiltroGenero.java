package ej8.pFiltros;

import ej8.Pelicula;

public class FiltroGenero extends Filtro {

    public FiltroGenero(String genero) {
        super(genero);
    }

    @Override
    public int compareTo(Pelicula p) {
        if (p.getGeneros().contains(palabra)) {
            return 1;
        }
        return -1;
    }

}
