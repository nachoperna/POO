package ej9.pGravamen;

import ej9.Producto;

public abstract class Gravamen {
    public abstract float impuestoProvincial(Producto p);

    public abstract float impuestoNacional(Producto p);
}
