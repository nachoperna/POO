import java.time.LocalDate;
import java.util.ArrayList;

public class NoticiaVentana extends Noticia {
    private LocalDate limite;

    public NoticiaVentana(String titulo, String texto, String autor, ArrayList<String> palabras_clave, String tema,
            ArrayList<Comentario> comentarios, LocalDate limite) {
        super(titulo, texto, autor, palabras_clave, tema, comentarios);
        this.limite = limite;
    }

    public void addComentario(Comentario c) {
        if (!LocalDate.now().isAfter(limite)) {
            addComentario(c);
        }
    }
}
