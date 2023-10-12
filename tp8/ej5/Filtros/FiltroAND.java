package ej5.Filtros;

import ej5.Notificacion;

public class FiltroAND extends Filtro {
    private Filtro f1, f2;

    public FiltroAND(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean aplica(Notificacion n) {
        return f1.aplica(n) && f2.aplica(n);
    }

}
