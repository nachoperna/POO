package ej2;

import ej2.Filtros.Filtro;
import ej2.Filtros.FiltroNombre;
import ej2.Filtros.FiltroCreacion;
import ej2.Filtros.FiltroCreador;
import ej2.Filtros.FiltroOR;
import ej2.Filtros.FiltroAND;
import java.time.LocalDate;

import ej2.Files.Archivo;
import ej2.Files.Comprimidos;
import ej2.Files.Directorio;
import ej2.Files.Link;
import ej2.Files.Sys;

public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();

        Archivo a1 = new Archivo("objetos.ppt", 0, "Juan");

        sistema.addFile(a1);

        Directorio d1 = new Directorio("objetos.ppt");
        d1.addArchivo(a1);

        sistema.addFile(d1);
        sistema.addFile(new Archivo("a.exe", 0, null));
        sistema.addFile(new Archivo("b.exe", 0, null));
        Directorio d2 = new Directorio("dir1");
        d2.addArchivo(new Archivo("hh.exe", 0, null));
        d2.addArchivo(new Archivo("jj.doc", 0, null));

        Directorio d3 = new Directorio("dir2");
        d3.addArchivo(new Comprimidos("mm.zip", a1, 0));

        d2.addArchivo(d3);

        sistema.addFile(d2);

        System.out.println("- SERVICIO A -");
        System.out.println("\ni.\n");
        System.out.println(sistema.busqueda(new FiltroNombre("objetos.ppt")));
        System.out.println("\nii.\n");
        System.out.println(sistema.busqueda(new FiltroCreacion(LocalDate.of(2001, 6, 25))));
        System.out.println("\niii.\n");
        System.out.println(
                sistema.busqueda(new FiltroOR(new FiltroNombre("objetos.ppt"), new FiltroNombre("programacion.ppt"))));
        System.out.println("\niv.\n");
        // System.out.println(
        // sistema.busqueda(new FiltroOR(new FiltroAND(new FiltroNombre("objetos.ppt"),
        // new FiltroCreador("Juan")),
        // new FiltroCreacion(LocalDate.of(1990, 2, 25)))));

        System.out.println("\n- SERVICIO B -");
        System.out.println(sistema.listadoPath());

    }
}
