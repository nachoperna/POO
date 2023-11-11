import java.time.LocalDate;

public class FiltroFecha implements Filtro {
    private LocalDate fecha;

    public FiltroFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean cumple(Busqueda g) {
        return ((Transaccion) (g)).getFecha().isEqual(fecha);
    }

}
