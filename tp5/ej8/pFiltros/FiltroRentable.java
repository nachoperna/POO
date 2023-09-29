package ej8.pFiltros;

import java.util.ArrayList;

import ej8.Pelicula;

public class FiltroRentable { // FiltroRentable puede ser una clase aparte sin implementaciones
    private String genero;
    private int duracion;
    private int estreno;
    private ArrayList<String> generos = new ArrayList<>();
    private Pelicula pelicula;

    public FiltroRentable(Pelicula p) {
        pelicula = p;
    }

    public FiltroRentable(Pelicula p, String genero, int duracion, int estreno, ArrayList<String> generos) {
        pelicula = p;
        this.genero = genero;
        this.duracion = duracion;
        this.estreno = estreno;
        this.generos = generos;
    }

    public boolean filtra() {
        boolean x = false;
        for (String g : generos) {
            if (new FiltroGenero(g).compareTo(pelicula) > 0) { // si x == true entonces significa que la pelicula
                                                               // pertenece a algun genero requerido
                x = true;
            }
        }

        // return ((pelicula.genero != "comedia" && pelicula.duracion < 120) &&
        // (pelicula.estreno > 2017 || pelicula.genero == "infantil" o "documental")
        return ((new FiltroGenero(genero).compareTo(pelicula) < 0
                && new FiltroDuracion(duracion).compareTo(pelicula) > 0))
                && ((new FiltroAnio(estreno).compareTo(pelicula) < 0) || (x)); // desglosar
                                                                               // generos
                                                                               // y
                                                                               // compara
                                                                               // uno
                                                                               // por
                                                                               // uno
    }

}
