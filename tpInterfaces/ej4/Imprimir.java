package ej4;

public class Imprimir implements AccionEjecutable {

    @Override
    public void ejecutarNodo(Object nodo) {
        System.out.println(nodo.toString());
    }

}
