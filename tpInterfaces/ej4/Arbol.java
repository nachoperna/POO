package ej4;

public class Arbol {
    private class Nodo {
        int valor;
        Nodo izq;
        Nodo der;

        public Nodo(int valor) {
            this.valor = valor;
            izq = null;
            der = null;
        }

        public String toString() {
            return "Value: " + valor + " | izq: " + izq + " | der: " + der;
        }
    }

    private Nodo raiz;

    private Nodo addNodo(Nodo a, int value) {
        if (a == null) {
            return new Nodo(value);
        } else if (a.valor < value) {
            a.der = addNodo(a.der, value);
        } else {
            a.izq = addNodo(a.izq, value);
        }
        return a;
    }

    public Arbol() {
        raiz = null;
    }

    public void nuevoNodo(int value) {
        raiz = addNodo(raiz, value);
    }

    public Nodo getRaiz() {
        return raiz;
    }

    private void recorrido(AccionEjecutable exe, Nodo a) {
        if (a != null) {
            recorrido(exe, a.izq);
            exe.ejecutarNodo(a);
            recorrido(exe, a.der);
        }
    }

    public void recorrido(AccionEjecutable exe) {
        if (raiz == null) {
            System.out.println("raiz vacia");
        }
        recorrido(exe, raiz);
    }

}
