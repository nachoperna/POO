package ej4;

public class Main {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        arbol.nuevoNodo(8);
        arbol.nuevoNodo(3);
        arbol.nuevoNodo(1);
        arbol.nuevoNodo(10);
        arbol.nuevoNodo(6);
        arbol.nuevoNodo(4);
        arbol.nuevoNodo(7);
        arbol.nuevoNodo(14);
        arbol.nuevoNodo(13);

        arbol.recorrido(new Imprimir());

        ListaAsc l1 = new ListaAsc();
        arbol.recorrido(l1);
        System.out.println(l1.toString());

        ListaDsc l2 = new ListaDsc();
        arbol.recorrido(l2);
        System.out.println(l2.toString());

    }
}
