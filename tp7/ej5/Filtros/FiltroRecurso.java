package ej5.Filtros;

import ej5.Tareas.Tarea;

public class FiltroRecurso extends Filtro {
    private String recurso;

    public FiltroRecurso(String recurso) {
        this.recurso = recurso;
    }

    @Override
    public boolean aplica(Tarea t) {
        return t.utilizaRecurso(recurso);
    }

}
