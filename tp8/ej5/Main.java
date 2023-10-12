package ej5;

import ej5.Filtros.FiltroAND;
import ej5.Filtros.FiltroOR;
import ej5.Filtros.FiltroPalabra;
import ej5.Filtros.FiltroSize;
import ej5.Ordenamiento.OrdenaNotifAsc;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        System.out.println("- SERVICIO 1 -");
        System.out.println(empresa.cantEmpleados(new Grupo(null, null)));

        System.out.println("- SERVICIO 2 -");
        System.out.println(empresa.listado(new OrdenaNotifAsc()));

        System.out.println("- SERVICIO 3 -");
        empresa.modificaFiltro(new Grupo("Programadores JAVA", null),
                new FiltroAND(new FiltroOR(new FiltroPalabra("JAVA"), new FiltroPalabra("JDK")), new FiltroSize(25)));
        ;

        System.out.println("- SERVICIO 4 -");
        System.out.println(empresa.listado(new FiltroPalabra("MATRIX"), null));

        System.out.println("- SERVICIO 5 -");
        System.out.println(empresa.listado(new FiltroSize(15), null));

        System.out.println("- SERVICIO 6 -");
        System.out.println(empresa.cantMensajes(new Grupo("null", null)));
    }
}
