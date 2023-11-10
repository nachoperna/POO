import java.util.ArrayList;

public interface Modelo {
    ArrayList<String> getPalabrasClave();

    String getTema();

    Modelo getCopia(Filtro f);

    int getCantidad(Filtro f);
}
