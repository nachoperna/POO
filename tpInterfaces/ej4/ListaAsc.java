package ej4;

public class ListaAsc extends Lista implements AccionEjecutable {

    @Override
    public void ejecutarNodo(Object nodo) {
        add(nodo);
    }

}
