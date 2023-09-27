package ej5;

public class CompFortaleza implements Comparable<Ficha> {
    int criterio;

    public CompFortaleza(int criterio) {
        this.criterio = criterio;
    }

    @Override
    public int compareTo(Ficha f) {
        if (f.getFortaleza() > criterio) {
            return 1;
        }
        return -1;
    }

}
