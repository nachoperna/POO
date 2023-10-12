package ej4.Seguros;

import java.time.LocalDate;
import java.util.ArrayList;

import ej4.Filtros.Filtro;

public class SeguroTemporal extends Seguro {
    private static LocalDate inicio;
    private static LocalDate fin;
    private Seguro seguro;

    public SeguroTemporal(Seguro seguro, LocalDate inicio, LocalDate fin) {
        super(seguro.getPoliza(), seguro.getDni_dueño(), seguro.getMonto_asegurado(), seguro.getDescripcion());
        this.seguro = seguro;
        SeguroTemporal.inicio = inicio;
        SeguroTemporal.fin = fin;
    }

    public static float calculaMonto(float x) {
        if (LocalDate.now().isAfter(inicio) && LocalDate.now().isBefore(fin)) {
            return x;
        }
        return 0;
    }

    public void agregaAlistado(ArrayList<Seguro> seguros, Filtro filtro) {
        seguro.agregaAlistado(seguros, filtro);
    }

    @Override
    public void calculaCosto() {
        setCosto(calculaMonto(seguro.getCosto()));
    }

}
