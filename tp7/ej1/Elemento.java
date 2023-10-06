public abstract class Elemento {
    private int posicion;
    private int tamanio;

    public Elemento(int posicion, int tamanio) {
        this.posicion = posicion;
        this.tamanio = tamanio;
    }

    public int getPosicion() {
        return posicion;
    }

    public abstract int getTamanio();
}
