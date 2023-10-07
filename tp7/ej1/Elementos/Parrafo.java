package Elementos;

public class Parrafo extends Elemento {
    private String texto;
    private int tamanio_fuente;

    public Parrafo(String texto) {
        super(texto.length());
        this.texto = texto;
        tamanio_fuente = 10;
    }

    @Override
    public int getTamanio() {
        return texto.length();
    }

    @Override
    public void cambiaTamanio(int porcentaje) {
        if (porcentaje > 0)
            tamanio_fuente *= ((porcentaje / 100) + 1);
        else {
            tamanio_fuente *= (1 - (porcentaje / 100));
        }
    }
}
