package ej4;

import ej4.Filtros.FiltroAND;
import ej4.Filtros.FiltroDNI;
import ej4.Filtros.FiltroDescripcion;
import ej4.Filtros.FiltroMonto;
import ej4.Ordenamiento.OrdenaDNI;
import ej4.Ordenamiento.OrdenaPoliza;

public class Main {
    public static void main(String[] args) {
        Aseguradora aseguradora = new Aseguradora();

        // SERVICIO A
        System.out.println(aseguradora.listado(new FiltroDescripcion("Automotor"), new OrdenaDNI()));

        // SERVICIO B
        System.out.println(aseguradora.listado(new FiltroAND(new FiltroDescripcion("Hogar"), new FiltroMonto(250000)),
                new OrdenaDNI()));

        // SERVICIO C
        System.out.println(aseguradora.listado(new FiltroDNI(24134323), new OrdenaPoliza()));

        // SERVICIO D
        // combinacinoes logicas de busqueda
    }
}
