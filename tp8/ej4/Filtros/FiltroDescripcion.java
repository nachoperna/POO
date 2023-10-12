package ej4.Filtros;

import ej4.Seguros.Seguro;

public class FiltroDescripcion extends Filtro {
    private String palabra;

    public FiltroDescripcion(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean aplica(Seguro seguro) {
        return seguro.getDescripcion().contains(palabra);
    }

}
