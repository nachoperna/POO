package ej4.Filtros;

import ej4.Seguros.Seguro;

public class FiltroAND extends Filtro {
    Filtro f1, f2;

    public FiltroAND(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean aplica(Seguro seguro) {
        return f1.aplica(seguro) && f2.aplica(seguro);
    }

}
