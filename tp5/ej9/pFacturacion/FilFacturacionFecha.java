package ej9.pFacturacion;

import java.time.LocalDate;

import ej9.Factura;

public class FilFacturacionFecha extends FiltroFacturacion {
    private LocalDate fecha;

    public FilFacturacionFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean aplica(Factura f) {
        return f.conincideFecha(fecha);
    }

}
