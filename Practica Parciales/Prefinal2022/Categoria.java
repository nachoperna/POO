import java.util.ArrayList;

public class Categoria implements Modelo {
    private ArrayList<Modelo> noticias = new ArrayList<>();
    private int indice_tema; // categoria = 3, seccion = 4, subseccion = 10

    public Categoria(ArrayList<Modelo> noticias, int indice) {
        this.noticias = noticias;
        indice_tema = indice;
    }

    public ArrayList<Modelo> getNoticias() {
        return noticias;
    }

    @Override
    public ArrayList<String> getPalabrasClave() {
        ArrayList<String> aux = new ArrayList<>();
        for (Modelo n : noticias) {
            for (String pal : n.getPalabrasClave()) {
                if (!aux.contains(pal)) {
                    aux.add(pal);
                }
            }
        }
        return aux;
    }

    @Override
    public String getTema() {
        if (!noticias.isEmpty()) {
            if (noticias.size() >= indice_tema) {
                return noticias.get(indice_tema).getTema();
            }
            return noticias.get(0).getTema();
        }
        return null;
    }

    @Override
    public Categoria getCopia(Filtro f) {
        ArrayList<Modelo> aux = new ArrayList<>();
        for (Modelo n : noticias) {
            aux.add(n.getCopia(f));
        }
        if (!aux.isEmpty()) {
            return new Categoria(aux, indice_tema);
        }
        return null;
    }

    @Override
    public int getCantidad(Filtro f) {
        int x = 0;
        for (Modelo n : noticias) {
            x += n.getCantidad(f);
        }
        return x;
    }

}
