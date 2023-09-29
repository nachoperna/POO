package ej9.pRecaudacion;

import java.time.LocalDate;

import ej9.Factura;

public class FilRecaudaFecha extends FiltroRecaudacion {
    private LocalDate fecha;

    public FilRecaudaFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean aplica(Factura f) {
        return f.conincideFecha(fecha);
    }

}
