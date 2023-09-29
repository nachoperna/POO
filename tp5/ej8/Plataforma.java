package ej8;

import java.util.ArrayList;

import ej8.pFiltros.FiltroRentable;

public class Plataforma {
    private ArrayList<Pelicula> catalogo = new ArrayList<>();

    public Plataforma() {

    }

    public void addPelicula(Pelicula p, FiltroRentable rentabilidad) {
        if (esRentable(p, rentabilidad)) {
            catalogo.add(p);
            System.out.println("La pelicula se ha añadido al catalogo.");
        } else {
            System.out.println("La pelicula no es rentable para esta plataforma.");
        }
    }

    public boolean esRentable(Pelicula p, FiltroRentable rentabilidad) {
        return rentabilidad.filtra();
    }

    public ArrayList<Pelicula> busqueda(Comparable<Pelicula> filtro) {
        ArrayList<Pelicula> aux = new ArrayList<>();
        for (Pelicula pelicula : catalogo) {
            if (filtro.compareTo(pelicula) > 0) { // Si la pelicula cumple con el filtro deseado la agrega a la lista
                aux.add(pelicula);
            }
        }
        return aux;
    }
}
