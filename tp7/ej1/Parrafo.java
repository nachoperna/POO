public class Parrafo extends Elemento {
    private String texto;

    public Parrafo(String texto, int posicion) {
        super(posicion, texto.length());
        this.texto = texto;
    }

    @Override
    public int getTamanio() {
        return texto.length();
    }

}
