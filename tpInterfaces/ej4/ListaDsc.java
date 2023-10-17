package ej4;

import java.util.ArrayList;
import java.util.Collections;

public class ListaDsc extends Lista implements AccionEjecutable {

    @Override
    public void ejecutarNodo(Object nodo) {
        add(nodo);
    }

    public ArrayList<Object> getLista() {
        Collections.reverse(getLista());
        return getLista();
    }

}
