package ej3;

public class ContadorPalabrasPlugin extends GuardaTexto implements Plugin {
    private int cantPalabras;

    public ContadorPalabrasPlugin(String texto) {
        super(texto);
    }

    @Override
    public void ejecutar() {
        cantPalabras = getTexto().split("\\s").length;
    }

    public int getCantPalabras() {
        return cantPalabras;
    }
}
