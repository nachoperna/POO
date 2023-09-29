package ej9;

import ej9.pGravamen.Gravamen;

public class Producto {
    private String nombre;
    private int stock;
    private float precio;

    public Producto(String nombre, int stock, float precio) {
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }

    public Producto(String nombre, int stock, float precio, Gravamen gravamen) {
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio + gravamen.impuestoNacional(this) + gravamen.impuestoProvincial(this);
    }

    public void cambiaStock(int x) {
        stock += x;
    }

    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return stock;
    }

    public float getPrecio() {
        return precio;
    }

}
