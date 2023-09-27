package ej6;

public class CompCantidad implements Comparable<Noticia> {
    private int cant;

    public CompCantidad(int cantidad) {
        cant = cantidad;
    }

    @Override
    public int compareTo(Noticia n) {
        return n.getCuerpo().size() < cant; // cuerpo tipo Object
    }

}
