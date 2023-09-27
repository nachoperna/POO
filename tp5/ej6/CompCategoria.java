package ej6;

public class CompCategoria extends CompPalabra {

    public CompCategoria(String y) {
        super(y);
    }

    @Override
    public int compareTo(Noticia n) {
        return getX().compareTo(n.getClasificacion());
    }

}
