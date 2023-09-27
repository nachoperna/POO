package ej6;

public abstract class CompPalabra implements Comparable<Noticia> {
    private String x;

    public CompPalabra(String y) {
        x = y;
    }

    public String getX() {
        return x;
    }

    @Override
    public abstract int compareTo(Noticia o);

}
