package ej5.Filtros;

import ej5.Tareas.Tarea;

public class FiltroAtraso extends Filtro {

    @Override
    public boolean aplica(Tarea t) {
        return t.estaAtrasada();
    }

}
