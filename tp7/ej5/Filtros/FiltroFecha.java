package ej5.Filtros;

import java.time.LocalDate;

import ej5.Tareas.Tarea;

public class FiltroFecha extends Filtro {
    private LocalDate fecha;

    public FiltroFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean aplica(Tarea t) {
        return t.getInicio_estimado().isBefore(fecha);
    }

}
