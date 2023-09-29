package ej8.pFiltros;

import ej8.Pelicula;

public class FiltroAnioyDur implements Comparable<Pelicula> {
    private int estreno;
    private int duracion;

    public FiltroAnioyDur(int estreno, int duracion) {
        this.estreno = estreno;
        this.duracion = duracion;
    }

    @Override
    public int compareTo(Pelicula p) {
        return new FiltroAnio(estreno).compareTo(p) + new FiltroDuracion(duracion).compareTo(p);
    }

}
