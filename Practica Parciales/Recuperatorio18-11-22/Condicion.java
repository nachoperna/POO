import java.util.ArrayList;

public class Condicion implements Filtro {
    private Filtro f;
    private ArrayList<String> palabra = new ArrayList<>();

    public Condicion(Filtro f, ArrayList<String> palabra) {
        this.f = f;
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Elemento e) {
        return f.cumple(e);
    }

    public ArrayList<String> getPalabra() {
        return palabra;
    }

}
