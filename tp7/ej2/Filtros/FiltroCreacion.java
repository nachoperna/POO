package ej2.Filtros;

import ej2.Files.Sys;
import java.time.LocalDate;

public class FiltroCreacion extends Filtro {
    private LocalDate fecha;

    public FiltroCreacion(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean encuentra(Sys file) {
        return file.getCreacion().equals(fecha);
    }

}
