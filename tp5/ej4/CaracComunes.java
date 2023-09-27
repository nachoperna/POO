package ej4;

import java.util.ArrayList;

public class CaracComunes {
    private String nombre;
    private ArrayList<Object> lista = new ArrayList<>();

    public CaracComunes(String nombre, ArrayList<Object> lista) {
        this.nombre = nombre;
        this.lista = lista;
    }

    public void add(Object l) {
        lista.add(l);
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Object> getLista() {
        return lista;
    }
}
