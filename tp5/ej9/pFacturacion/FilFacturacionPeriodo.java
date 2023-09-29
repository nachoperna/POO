package ej9.pFacturacion;

import java.time.LocalDate;

import ej9.Factura;

public class FilFacturacionPeriodo extends FiltroFacturacion {
    private LocalDate fecha1;
    private LocalDate fecha2;

    public FilFacturacionPeriodo(LocalDate fecha1, LocalDate fecha2) {
        this.fecha1 = fecha1;
        this.fecha2 = fecha2;
    }

    @Override
    public boolean aplica(Factura f) {
        return f.conincideFecha(fecha1, fecha2);
    }

}
