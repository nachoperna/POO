package Elementos;

public abstract class Elemento {
    private int tamanio;

    public Elemento(int tamanio) {
        this.tamanio = tamanio;
    }

    public abstract int getTamanio();

    public abstract void cambiaTamanio(int porcentaje);
}
