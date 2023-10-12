package ej4;

import java.util.ArrayList;
import java.util.Comparator;

import ej4.Filtros.Filtro;
import ej4.Seguros.Seguro;

public class Aseguradora {
    private ArrayList<Seguro> seguros = new ArrayList<>();

    public Aseguradora() {

    }

    public void addSeguro(Seguro s) {
        seguros.add(s);
    }

    public ArrayList<Seguro> listado(Filtro filtro, Comparator<Seguro> comp) {
        ArrayList<Seguro> aux = new ArrayList<>();
        for (Seguro seguro : seguros) {
            seguro.agregaAlistado(aux, filtro);
        }
        aux.sort(comp);
        return aux;
    }
}
