package ej5.Filtros;

import ej5.Notificacion;

public class FiltroRemitente extends Filtro {
    private String remitente;

    public FiltroRemitente(String remitente) {
        this.remitente = remitente;
    }

    @Override
    public boolean aplica(Notificacion n) {
        return n.getRemitente().getNombre() == remitente;
    }

}
