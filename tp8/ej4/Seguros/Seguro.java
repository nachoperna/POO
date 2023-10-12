package ej4.Seguros;

import java.util.ArrayList;

import ej4.Filtros.Filtro;

public abstract class Seguro {
    private int poliza;
    private int dni_dueño;
    private float monto_asegurado;
    private String descripcion;
    private float costo;

    public Seguro(int poliza, int dni_dueño, float monto_asegurado, String descripcion) {
        this.poliza = poliza;
        this.dni_dueño = dni_dueño;
        this.monto_asegurado = monto_asegurado;
        this.descripcion = descripcion;
    }

    public int getPoliza() {
        return poliza;
    }

    public int getDni_dueño() {
        return dni_dueño;
    }

    public float getMonto_asegurado() {
        return monto_asegurado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public float getCosto() {
        return costo;
    }

    public void agregaAlistado(ArrayList<Seguro> seguros, Filtro filtro) {
        if (filtro.aplica(this)) {
            seguros.add(this);
        }
    }

    public abstract void calculaCosto();
}
