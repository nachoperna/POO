package ej4;

import java.util.ArrayList;

public class Lista {
    private ArrayList<Object> lista = new ArrayList<>();

    public void add(Object n) {
        lista.add(n);
    }

    public ArrayList<Object> getLista() {
        return lista;
    }
}
