import java.util.ArrayList;

public class Seccion extends Elemento {
    private ArrayList<Elemento> noticias = new ArrayList<>();

    public ArrayList<Elemento> getNoticias() {
        return noticias;
    }

    @Override
    public String getCategoria() {
        return noticias.get(0).getCategoria();
    }

    @Override
    public ArrayList<String> getPalabras_clave() {
        ArrayList<String> aux = new ArrayList<>();
        for (Elemento e : noticias) {
            for (String pal : e.getPalabras_clave()) { // chequea todas las palabras clave de la noticia
                if (!aux.contains(pal)) { // sin contar repetidas
                    aux.add(pal);
                }
            }
        }
        return aux;
    }

    @Override
    public ArrayList<Noticia> listar(Filtro filtro) {
        ArrayList<Noticia> aux = new ArrayList<>();
        for (Elemento elemento : noticias) {
            aux.addAll(elemento.listar(filtro));
        }
        return aux;
    }

    @Override
    public String getAutor() {
        return " ";
    }

    @Override
    public String getContenido() {
        return " ";
    }

    @Override
    public String getTitulo() {
        return " ";
    }

    @Override
    public void addPalabras(ArrayList<String> palabras) {

    }

}
