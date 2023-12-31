import java.util.ArrayList;

public class Noticia extends Elemento {
    private String contenido, titulo, autor, categoria;
    private ArrayList<String> palabras_clave = new ArrayList<>();

    public Noticia(String contenido, String titulo, String autor, String categoria, ArrayList<String> palabras_clave) {
        this.contenido = contenido;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.palabras_clave = palabras_clave;
    }

    public void addPalabras(ArrayList<String> palabras) {
        palabras_clave.addAll(palabras);
    }

    @Override
    public String getCategoria() {
        return categoria;
    }

    @Override
    public ArrayList<String> getPalabras_clave() {
        return palabras_clave;
    }

    @Override
    public String getContenido() {
        return contenido;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public ArrayList<Noticia> listar(Filtro filtro) {
        if (filtro.cumple(this)) {
            ArrayList<Noticia> aux = new ArrayList<>();
            aux.add(this.copiar());
            return aux;
        }
        return new ArrayList<>();
    }

    public Noticia copiar() {
        return new Noticia(getContenido(), getTitulo(), getAutor(), getCategoria(), getPalabras_clave());
    }

    public void completaPalabras(ArrayList<Condicion> c) { // recorre una lista de condiciones
        for (Condicion condicion : c) {
            condicion.ejecuta(this);
        }
    }
}
