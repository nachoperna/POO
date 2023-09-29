package ej9.pRecaudacion;

import java.util.Map;

import ej9.Factura;
import ej9.Producto;

public abstract class FiltroRecaudacion {
    public abstract boolean aplica(Factura f);

    public Map<Producto, Float> retorno(Factura f) {
        return f.productoMasVendido();
    }
}
