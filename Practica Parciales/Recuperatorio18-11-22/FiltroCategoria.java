public class FiltroCategoria implements Filtro {
    private String categoria;

    public FiltroCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean cumple(Elemento e) {
        return e.getCategoria().equals(categoria);
    }

}
