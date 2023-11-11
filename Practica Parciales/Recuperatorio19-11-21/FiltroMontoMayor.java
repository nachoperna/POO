public class FiltroMontoMayor implements Filtro {
    private float monto;

    public FiltroMontoMayor(float monto) {
        this.monto = monto;
    }

    @Override
    public boolean cumple(Busqueda g) {
        return ((Transaccion) (g)).getMonto() > monto;
    }

}
