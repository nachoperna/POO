package ej2.Filtros;

import ej2.Files.Sys;
import ej2.Files.Archivo;

public class FiltroCreador extends Filtro {
    private String creador;

    public FiltroCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public boolean encuentra(Sys file) {
        return ((Archivo) file).getCreador() == creador;
    }

}
