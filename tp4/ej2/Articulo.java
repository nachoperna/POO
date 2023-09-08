package ej2;

import java.util.ArrayList;

public class Articulo extends Trabajo {
    // caracteristicas propias del articulo

    public Articulo(ArrayList<String> palabras_claves) {
        super(palabras_claves);
        // setea otras caracteristicas
    }

    public String toString() {
        return "Articulo" + super.toString();
    }
}
