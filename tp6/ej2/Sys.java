package ej2;

import java.time.LocalDate;

public class Sys {
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

}
