package ej8.pFiltros;

import ej8.Pelicula;

public class FiltroDuracion implements Comparable<Pelicula> {
    private int duracion;

    public FiltroDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public int compareTo(Pelicula p) {
        if (p.getDuracion() < duracion) {
            return 1;
        }
        return -1;
    }

}
