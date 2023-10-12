package ej5.Filtros;

import ej5.Notificacion;

public class FiltroPalabra extends Filtro {
    private String palabra;

    public FiltroPalabra(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean aplica(Notificacion n) {
        return n.getMensaje().contains(palabra);
    }

}
