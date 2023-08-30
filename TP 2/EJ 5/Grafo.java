import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Grafo {
    private Map<Integer, ArrayList<Arco>> grafo = new HashMap<>();

    public Grafo() {

    }

    public void addVertice(int origen, int destino, int costo) {
        Arco arco = new Arco(destino, costo);
        // grafo.put(origen, )
    }

    public static void main(String[] args) {

    }
}