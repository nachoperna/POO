package ej5;

public class CompDestruccion implements Comparable<Ficha> {
    int criterio;

    public CompDestruccion(int criterio) {
        this.criterio = criterio;
    }

    @Override
    public int compareTo(Ficha f) {
        if (f.getDestruccion() > criterio) {
            return 1;
        }
        return -1;
    }

}
