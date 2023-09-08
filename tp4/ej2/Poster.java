package ej2;

import java.util.ArrayList;

public class Poster extends Trabajo {
    // caracteristicas especificas de un Poster

    public Poster(ArrayList<String> palabras_claves) {
        super(palabras_claves);
        // setea otras caracteristicas
    }

    public Boolean esApto(ArrayList<String> conocimientos) {
        for (String tema : this.getPalabras_claves()) {
            if (conocimientos.contains(tema)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "Poster" + super.toString();
    }
}
