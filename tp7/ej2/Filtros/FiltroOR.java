package ej2.Filtros;

import ej2.Files.Sys;

public class FiltroOR extends Filtro {
    private Filtro f1, f2;

    public FiltroOR(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean encuentra(Sys file) {
        return (f1.encuentra(file) || f2.encuentra(file));
    }

}
