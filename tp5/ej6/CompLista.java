package ej6;

import java.util.ArrayList;

public class CompLista implements Comparable<Noticia> {
    private ArrayList<String> lista = new ArrayList<>();

    public CompLista(ArrayList<String> lista) {
        this.lista = lista;
    }

    @Override
    public int compareTo(Noticia n) {
        return n.getCuerpo().containsAll(lista); // cuerpo tipo Object
    }

}
