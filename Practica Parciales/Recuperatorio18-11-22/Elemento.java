import java.util.ArrayList;

public abstract class Elemento {
    public abstract String getCategoria();

    public abstract ArrayList<String> getPalabras_clave();

    public abstract ArrayList<Noticia> listar(Filtro filtro);

    public abstract String getAutor();

    public abstract String getContenido();

    public abstract String getTitulo();

    public abstract void addPalabras(ArrayList<String> palabras);

}
