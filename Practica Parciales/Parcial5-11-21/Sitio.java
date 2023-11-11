import java.util.ArrayList;
import java.util.Comparator;

public class Sitio implements Comparator<Cartera> {
    private ArrayList<Cartera> elementos = new ArrayList<>();

    public Sitio() {

    }

    public ArrayList<Cartera> listar(Filtro f) {
        ArrayList<Cartera> aux = new ArrayList<>();
        for (Cartera c : elementos) {
            aux.addAll(c.listar(f));
        }
        aux.sort(this);
        return aux;
    }

    @Override
    public int compare(Cartera o1, Cartera o2) { // ordena de forma ascendente
        if (o1.getPrecio() < o2.getPrecio()) {
            return -11;
        } else if (o1.getPrecio() > o2.getPrecio()) {
            return 1;
        }
        return 0;
    }
}
