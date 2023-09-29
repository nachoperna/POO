package ej9.pGravamen;

import java.time.LocalDate;

import ej9.Producto;

public class GravamenBajo extends Gravamen {

    @Override
    public float impuestoProvincial(Producto p) {
        return (float) ((p.getPrecio() * 0.10) + 0.10);
    }

    @Override
    public float impuestoNacional(Producto p) {
        if (anioPar()) {
            return (float) ((p.getPrecio() * 0.05) + 0.25);
        }
        return (float) (p.getPrecio() * 0.05);
    }

    public boolean anioPar() {
        return (LocalDate.now().getYear() % 2 == 0);
    }
}
