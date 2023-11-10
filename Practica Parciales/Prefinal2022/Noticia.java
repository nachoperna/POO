import java.util.ArrayList;

public class Noticia implements Modelo {
    private String titulo;
    private String texto;
    private String autor;
    private ArrayList<String> palabras_clave = new ArrayList<>();
    private String tema;
    private ArrayList<Comentario> comentarios = new ArrayList<>();

    public Noticia(String titulo, String texto, String autor, ArrayList<String> palabras_clave, String tema,
            ArrayList<Comentario> comentarios) {
        this.titulo = titulo;
        this.texto = texto;
        this.autor = autor;
        this.palabras_clave = palabras_clave;
        this.tema = tema;
        this.comentarios = comentarios;
    }

    public void addComentario(Comentario c) {
        comentarios.add(c);
    }

    @Override
    public ArrayList<String> getPalabrasClave() {
        return palabras_clave;
    }

    @Override
    public String getTema() {
        return tema;
    }

    @Override
    public Modelo getCopia(Filtro f) {
        if (f.cumple(this))
            return new Noticia(titulo, texto, autor, palabras_clave, tema, comentarios);
        return null;
    }

    public String getAutor() {
        return autor;
    }

    public ArrayList<String> getPalabras_clave() {
        return palabras_clave;
    }

    public ArrayList<Comentario> getComentarios() {
        return comentarios;
    }

    @Override
    public int getCantidad(Filtro f) {
        if (f.cumple(this)) {
            return 1;
        }
        return 0;
    }

}
