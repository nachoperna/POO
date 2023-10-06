package ej4;

public class Arbol {
    private Nodo raiz;

    public Arbol(Nodo raiz) {
        this.raiz = raiz;
    }

    public void addNodo(Nodo n) {
        addNodoP(raiz, n);
    }

    public void recorrido(/* Accion x */) {
        recorridoP(raiz/* , x */);
    }

    private void addNodoP(Nodo raiz, Nodo n) {
        if (raiz == null) {
            raiz = n;
        } else if (raiz.compareTo(n) > 0) {
            addNodoP(raiz.getDer(), n);
        } else {
            addNodoP(raiz.getIzq(), n);
        }
    }

    private void recorridoP(Nodo raiz/* , Accion x */) {
        recorridoP(raiz.getIzq());
        // x.ejecuta(raiz);
        raiz.visitado();
        recorridoP(raiz.getDer());
    }
}
