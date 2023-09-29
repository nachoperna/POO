package ej8;

import java.util.ArrayList;

import ej8.pFiltros.FiltroActyDir;
import ej8.pFiltros.FiltroAnio;
import ej8.pFiltros.FiltroAnioyDur;
import ej8.pFiltros.FiltroDuracion;
import ej8.pFiltros.FiltroGenero;
import ej8.pFiltros.FiltroRentable;
import ej8.pFiltros.FiltroTitulo;

public class Main {
    public static void main(String[] args) {
        Plataforma plataforma = new Plataforma();

        ArrayList<String> actores = new ArrayList<>();
        actores.add("Will Smith");
        ArrayList<String> generos = new ArrayList<>();
        generos.add("documental");
        generos.add("drama");

        Pelicula p = new Pelicula("La vida de WIll", null, generos, actores, "Martin Scorsese",
                (int) Math.random() * 2000 + 2023, (int) Math.random() * 90 + 180, 10);

        ArrayList<String> filtro_generos = new ArrayList<>();
        filtro_generos.add("infantil");
        filtro_generos.add("documental");

        plataforma.addPelicula(p, new FiltroRentable(p, "comedia", 120, 2017, filtro_generos)); // aca se sabe si una
                                                                                                // pelicula es rentable
                                                                                                // para la plataforma

        System.out.println(plataforma.busqueda(new FiltroAnio(0)));
        System.out.println(plataforma.busqueda(new FiltroDuracion(0)));
        System.out.println(plataforma.busqueda(new FiltroGenero(null)));
        System.out.println(plataforma.busqueda(new FiltroTitulo(null)));
        System.out.println(plataforma.busqueda(new FiltroActyDir(null, null)));
        System.out.println(plataforma.busqueda(new FiltroAnioyDur(0, 0)));

    }
}
