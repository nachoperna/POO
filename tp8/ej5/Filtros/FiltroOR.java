package ej5.Filtros;

import ej5.Notificacion;

public class FiltroOR extends Filtro {
    Filtro f1, f2;

    public FiltroOR(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean aplica(Notificacion n) {
        return f1.aplica(n) || f2.aplica(n);
    }

}
