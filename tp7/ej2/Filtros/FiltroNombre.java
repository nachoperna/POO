package ej2.Filtros;

import ej2.Files.Sys;

public class FiltroNombre extends Filtro {
    private String nombre;

    public FiltroNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean encuentra(Sys file) { // implementar cambio para poder matchear con todos los archivos dentro de
                                         // comprimidos
        return file.getNombre() == nombre;
    }

}
