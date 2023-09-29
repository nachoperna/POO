package ej9.pGravamen;

import java.time.LocalDate;

import ej9.Producto;

public class GravamenAlto extends Gravamen {

    @Override
    public float impuestoProvincial(Producto p) {
        if (esDomingo()) {
            return (float) ((p.getPrecio() * 0.15) + 0.5);
        }
        return (float) (p.getPrecio() * 0.15);
    }

    @Override
    public float impuestoNacional(Producto p) {
        return (float) ((p.getPrecio() * 0.10) + 0.50);
    }

    public boolean esDomingo() {
        return (LocalDate.now().getDayOfWeek().getValue() == 7);
    }
}
