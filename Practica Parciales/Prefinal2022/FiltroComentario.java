public class FiltroComentario implements Filtro {
    private String autor;

    public FiltroComentario(String autor) {
        this.autor = autor;
    }

    @Override
    public boolean cumple(Noticia n) {
        for (Comentario c : n.getComentarios()) { // MAL IMPLEMENTADO, NO SE DEBE RECORRER LA LISTA POR FUERA DE NOTICIA
            if (c.getAutor().equals(autor)) {
                return true;
            }
        }
        return false;
    }

}
