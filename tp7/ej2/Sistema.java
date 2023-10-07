package ej2;

import ej2.Filtros.Filtro;

import ej2.Files.Sys;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Sys> files = new ArrayList<>();

    public Sistema() {

    }

    public void addFile(Sys file) {
        files.add(file);
    }

    // SERVICIO A
    public ArrayList<Sys> busqueda(Filtro f) {
        ArrayList<Sys> aux = new ArrayList<>();
        for (Sys file : files) {
            if (f.encuentra(file)) {
                aux.add(file);
            }
        }
        return aux;
    }

    // SERVICIO B
    public Path listadoPath() {
        Path path = new Path();
        for (Sys file : files) {
            path.add(file.listar());
        }
        return path;
    }
}
