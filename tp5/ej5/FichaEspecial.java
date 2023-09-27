package ej5;

public class FichaEspecial extends Ficha {

    public FichaEspecial(String nombre, int fortaleza, int espacio) {
        super(nombre, fortaleza, espacio, fortaleza / espacio);
    }

}
