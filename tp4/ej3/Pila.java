package ej3;

import java.util.ArrayList;

public class Pila {
    private ArrayList<Object> elementos = new ArrayList<>();

    public Pila() {

    }

    public Pila(ArrayList<Object> elementos) {
        this.elementos = elementos;
    }

    public void push(Object o) {
        elementos.add(o);
    }

    public Object pop() {
        Object aux = top();
        elementos.remove(elementos.size() - 1);
        return aux;
    }

    public Object top() {
        return elementos.get(elementos.size() - 1);
    }

    public int size() {
        return elementos.size();
    }

    public ArrayList<Object> getElementos() {
        return elementos;
    }

    public Pila copy() {
        return new Pila(this.getElementos());
    }

    public Pila reverse() {
        Pila aux = new Pila();
        for (int i = elementos.size() - 1; i >= 0; i--) {
            aux.push(elementos.get(i));
        }
        return aux;
    }

    public String toString() {
        return elementos.toString();
    }

    public static void main(String[] args) {
        Pila original = new Pila();
        original.push(1);
        original.push(2);
        original.push(3);
        original.push(4);
        original.push(5);

        System.out.println("Original: " + original);
        System.out.println("Pop: " + original.pop());
        System.out.println("Top: " + original.top());
        System.out.println("Size: " + original.size());

        Pila copia = original.copy();

        System.out.println("Copy: " + copia);

        Pila reversa = original.reverse();

        System.out.println("Reverse: " + reversa);

    }
}
