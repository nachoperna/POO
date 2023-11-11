import java.util.ArrayList;

public abstract class General {
    // public abstract void transferencia(Filtro f1, Filtro f2, float monto);
    public abstract ArrayList<Transaccion> getTransacciones(Filtro filtro);

    public abstract boolean deshacerTransaccion(Filtro filtro);

    public abstract void deposito(Filtro filtro, float monto);

    public abstract void extraccion(Filtro filtro, float monto);
}
