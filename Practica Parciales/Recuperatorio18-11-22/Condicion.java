import java.util.ArrayList;

public class Condicion {
    private Filtro f;
    private ArrayList<String> palabra = new ArrayList<>();

    public Condicion(Filtro f, ArrayList<String> palabra) {
        this.f = f;
        this.palabra = palabra;
    }

    public void ejecuta(Elemento e) {
        if (f.cumple(e)) {
            e.addPalabras(palabra);
        }
    }
}
