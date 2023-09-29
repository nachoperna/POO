package ej8;

import java.util.ArrayList;

public class Pelicula {
    private String titulo;
    private String sinopsis;
    private ArrayList<String> generos = new ArrayList<>();
    private ArrayList<String> actores = new ArrayList<>();
    private String director;
    private int estreno;
    private int duracion; // en minutos
    private int edad_minima;

    public Pelicula(String titulo, String sinopsis, ArrayList<String> generos, ArrayList<String> actores,
            String director, int estreno,
            int duracion, int edad_minima) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.generos = generos;
        this.actores = actores;
        this.director = director;
        this.estreno = estreno;
        this.duracion = duracion;
        this.edad_minima = edad_minima;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public ArrayList<String> getGeneros() {
        return generos;
    }

    public String getDirector() {
        return director;
    }

    public int getEstreno() {
        return estreno;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getEdad_minima() {
        return edad_minima;
    }

    public ArrayList<String> getActores() {
        return actores;
    }

}
