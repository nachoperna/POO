public class FiltroAutor implements Filtro {
    private String autor;

    public FiltroAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public boolean cumple(Elemento e) {
        return e.getAutor().equals(autor);
    }

}
