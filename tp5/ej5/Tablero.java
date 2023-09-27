package ej5;

import java.util.ArrayList;

public class Tablero {
    private float puntaje_minimo;
    private float dificultad;
    private ArrayList<Ficha> fichas = new ArrayList<>();

    public Tablero() {

    }

    public void setDificultad() {
        int sum_fortaleza = 0;
        int sum_destruccion = 0;
        for (Ficha ficha : fichas) {
            sum_fortaleza += ficha.getFortaleza();
            sum_destruccion += ficha.getDestruccion();
        }
        dificultad = sum_fortaleza / sum_destruccion;
    }

    public void addFichas(Ficha ficha) {
        fichas.add(ficha);
    }

    public void setPuntaje_minimo(float puntaje_minimo) {
        this.puntaje_minimo = puntaje_minimo;
    }

    public ArrayList<Ficha> busqueda(Comparable<Ficha> comparador) {
        ArrayList<Ficha> aux = new ArrayList<>();
        for (Ficha ficha : fichas) {
            if (comparador.compareTo(ficha) > 0) {
                aux.add(ficha);
            }
        }
        return aux;
    }

    public float getDificultad() {
        return dificultad;
    }

}
