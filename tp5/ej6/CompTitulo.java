package ej6;

public class CompTitulo extends CompPalabra {

    public CompTitulo(String y) {
        super(y);
    }

    @Override
    public int compareTo(Noticia n) {
        return getX().compareTo(n.getTitulo());
    }

}
