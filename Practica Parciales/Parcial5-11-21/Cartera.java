import java.util.ArrayList;

public abstract class Cartera {
    public abstract float getPrecio();

    public abstract int getAnio();

    public abstract String getMarca();

    public ArrayList<Cartera> listar(Filtro f) { // servicio 1
        if (f.cumple(this)) {
            ArrayList<Cartera> aux = new ArrayList<>();
            aux.add(this);
            return aux;
        }
        return new ArrayList<>();
    }

    public abstract int contar(); // servicio 2

    public abstract Cartera copia(Filtro f);
}