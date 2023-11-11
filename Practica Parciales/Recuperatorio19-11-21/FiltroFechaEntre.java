import java.time.LocalDate;

public class FiltroFechaEntre implements Filtro {
    private LocalDate f1, f2;

    public FiltroFechaEntre(LocalDate f1, LocalDate f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean cumple(Busqueda g) {
        return ((Transaccion) (g)).getFecha().isAfter(f1) && ((Transaccion) (g)).getFecha().isBefore(f2);
    }

}
