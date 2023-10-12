package ej4.Filtros;

import ej4.Seguros.Seguro;

public class FiltroMonto extends Filtro {
    private float monto;

    public FiltroMonto(float monto) {
        this.monto = monto;
    }

    @Override
    public boolean aplica(Seguro seguro) {
        return seguro.getMonto_asegurado() > monto;
    }

}
