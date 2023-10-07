package ej2.Files;

import java.time.LocalDate;

public abstract class Sys {
    private String nombre;
    private LocalDate creacion;
    private float tamanio; // en Kb

    public Sys(String nombre, float tamanio) {
        this.nombre = nombre;
        this.creacion = LocalDate.now();
        this.tamanio = tamanio;
    }

    public void cambiaTamanio(float x) {
        tamanio += x;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getCreacion() {
        return creacion;
    }

    public float getTamanio() {
        return tamanio;
    }

    public abstract String listar();

    public abstract String toString();
}
