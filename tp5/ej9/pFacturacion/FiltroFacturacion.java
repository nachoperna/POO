package ej9.pFacturacion;

import ej9.Factura;

public abstract class FiltroFacturacion {

    public abstract boolean aplica(Factura f);

    public float retorno(Factura f) {
        return f.getMonto_total();
    }

}
