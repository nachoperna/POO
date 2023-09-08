package ej2;

import java.util.ArrayList;

public class Trabajo {
    private ArrayList<String> palabras_claves = new ArrayList<>();

    public Trabajo(ArrayList<String> palabras_claves) {
        this.palabras_claves = palabras_claves;
    }

    public ArrayList<String> getPalabras_claves() {
        return palabras_claves;
    }

    public Boolean esApto(ArrayList<String> conocimientos) {
        if (conocimientos.containsAll(this.getPalabras_claves())) {
            return true;
        }
        return false;
    }

    public String toString() {
        return palabras_claves.toString();
    }
}
