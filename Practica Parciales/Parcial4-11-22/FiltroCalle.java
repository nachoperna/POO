public class FiltroCalle implements Filtro {
    private String calle;

    public FiltroCalle(String calle) {
        this.calle = calle;
    }

    @Override
    public boolean cumple(Elemento e) {
        return e.getDireccion().getCalle().equals(calle);
    }

}
