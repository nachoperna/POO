package ej8.pFiltros;

import ej8.Pelicula;

public class FiltroActyDir extends Filtro {
    String director;

    public FiltroActyDir(String actor, String director) {
        super(actor);
        this.director = director;
    }

    @Override
    public int compareTo(Pelicula p) {
        if ((p.getActores().contains(palabra)) && (p.getDirector() != director)) {
            return 1;
        }
        return -1;
    }

}
