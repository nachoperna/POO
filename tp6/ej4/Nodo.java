package ej4;

public class Nodo implements Comparable<Nodo> {
    private Comparable<Object> valor;
    private Nodo izq;
    private Nodo der;
    private Nodo padre;
    private int visitas;

    public Nodo(Comparable<Object> valor) {
        this.valor = valor;
        izq = null;
        der = null;
        padre = null;
    }

    public Comparable<Object> getValor() {
        return valor;
    }

    public Nodo getIzq() {
        return izq;
    }

    public Nodo getDer() {
        return der;
    }

    public Nodo getPadre() {
        return padre;
    }

    public void visitado() {
        visitas++;
    }

    public int getVisitas() {
        return visitas;
    }

    @Override
    public int compareTo(Nodo n) {
        return this.getValor().compareTo(n.getValor());
    }

    public String toString() {
        return "Nodo: " + valor;
    }
}
