package ej5.Filtros;

import ej5.Notificacion;

public class FiltroSize extends Filtro {
    private int largo;

    public FiltroSize(int largo) {
        this.largo = largo;
    }

    @Override
    public boolean aplica(Notificacion n) {
        return n.getMensaje().length() < largo;
    }

}
