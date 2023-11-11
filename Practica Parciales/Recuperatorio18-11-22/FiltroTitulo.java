public class FiltroTitulo implements Filtro {
    private String titulo;

    public FiltroTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean cumple(Elemento e) {
        return ((Noticia) (e)).getTitulo().equals(titulo);
    }

}
