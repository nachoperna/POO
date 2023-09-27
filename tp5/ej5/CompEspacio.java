package ej5;

public class CompEspacio implements Comparable<Ficha> {
    int criterio;

    public CompEspacio(int criterio) {
        this.criterio = criterio;
    }

    @Override
    public int compareTo(Ficha f) {
        if (f.getEspacio() > criterio) {
            return 1;
        }
        return -1;
    }

}
