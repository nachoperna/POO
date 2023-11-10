import java.util.ArrayList;

public class NoticiaParalela extends Noticia {
    private Noticia noticia;

    public NoticiaParalela(String titulo, String texto, String autor, ArrayList<String> palabras_clave, String tema,
            ArrayList<Comentario> comentarios, Noticia n) {
        super(titulo, texto, autor, palabras_clave, tema, comentarios);
        noticia = n;
    }

    public void addComentario(Comentario c) {
        super.addComentario(c);
        noticia.addComentario(c);
    }

    public Modelo getCopia(Filtro f) {
        return null;
    }
}
