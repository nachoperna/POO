package ej5.Tareas;

import java.time.LocalDate;

public class Recurso {
    private String nombre;
    private LocalDate fecha_liimite;

    public Recurso(String nombre, LocalDate fecha_limite) {
        this.nombre = nombre;
        this.fecha_liimite = fecha_limite;
    }

    public String getRecurso() {
        return nombre;
    }

    public LocalDate getFecha_liimite() {
        return fecha_liimite;
    }

}
