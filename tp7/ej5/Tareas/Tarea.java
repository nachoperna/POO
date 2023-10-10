package ej5.Tareas;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Tarea {
    private String nombre;
    private LocalDate inicio_estimado;
    private LocalDate final_estimado;
    private LocalDate inicio_real;
    private LocalDate final_real;
    private boolean completa;
    private boolean en_procesamiento;
    private ArrayList<Tarea> tareas_predecesoras = new ArrayList<>();

    public Tarea(String nombre, LocalDate inicio_estimado, LocalDate final_estimado) {
        this.nombre = nombre;
        this.inicio_estimado = inicio_estimado;
        this.final_estimado = final_estimado;
    }

    public void ejecutar() {
        inicio_real = LocalDate.now();
        en_procesamiento = true;
    }

    public void finalizar() {
        final_real = LocalDate.now();
        en_procesamiento = false;
        completa = true;
    }

    public boolean estaAtrasada() {
        return LocalDate.now().isAfter(final_estimado); // si ya se paso la fecha de final estimado
    }

    public void addTareaPredecesora(Tarea t) {
        tareas_predecesoras.add(t);
    }

    public ArrayList<Tarea> getTareas_predecesoras() {
        return tareas_predecesoras;
    }

    public int duracionEstimada() {
        return final_estimado.getDayOfYear() - inicio_estimado.getDayOfYear();
    }

    public LocalDate getInicio_estimado() {
        return inicio_estimado;
    }

    public LocalDate getFinal_estimado() {
        return final_estimado;
    }

    public boolean puedeAsignar(Recurso r) {
        return this.getInicio_estimado().isBefore(r.getFecha_liimite());
    }

    public abstract void addRecurso(Recurso r);

    public abstract boolean utilizaRecurso(String r);

    public abstract ArrayList<String> recursosInvolucrados();
}
