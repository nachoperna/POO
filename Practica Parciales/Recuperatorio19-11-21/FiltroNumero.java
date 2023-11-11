public class FiltroNumero implements Filtro {
    private int num;

    public FiltroNumero(int num) {
        this.num = num;
    }

    @Override
    public boolean cumple(Busqueda g) {
        return g.getNumero() == num;
    }

}
