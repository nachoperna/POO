package Elementos;

public class Imagen extends Parrafo {
    private int bytes;

    public Imagen(String url, int bytes) {
        super(url);
        this.bytes = bytes;
    }

    public int getTamanio() {
        return bytes;
    }

    public void cambiaTamanio(int porcentaje) {
        if (porcentaje > 0)
            bytes *= ((porcentaje / 100) + 1);
        else {
            bytes *= (1 - (porcentaje / 100));
        }
    }
}
