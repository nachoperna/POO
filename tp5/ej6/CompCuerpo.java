package ej6;

public class CompCuerpo extends CompPalabra {

    public CompCuerpo(String y) {
        super(y);
    }

    @Override
    public int compareTo(Noticia n) {
        return n.getCuerpo().contains(getX()); // cuerpo es de tipo object
    }

}
