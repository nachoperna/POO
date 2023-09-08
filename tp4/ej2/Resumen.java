package ej2;

import java.util.ArrayList;

public class Resumen extends Trabajo {
    // caracteristicas propias de un Resumen

    public Resumen(ArrayList<String> palabras_claves) {
        super(palabras_claves);
        // setea otras caracteristicas
    }

    public String toString() {
        return "Resumen" + super.toString();
    }
}
