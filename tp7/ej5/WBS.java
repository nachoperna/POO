package ej5;

import java.util.ArrayList;

import ej5.Filtros.Filtro;
import ej5.Tareas.Recurso;
import ej5.Tareas.Tarea;

public class WBS {
    private ArrayList<Tarea> tareas = new ArrayList<>();

    public WBS() {

    }

    public WBS(ArrayList<Tarea> tareas) {
        this.tareas = tareas;
    }

    public void addTarea(Tarea t) {
        tareas.add(t);
    }

    // SERVICIO 1 2 Y 3
    public ArrayList<Tarea> getLista(Filtro filtro) {
        ArrayList<Tarea> aux = new ArrayList<>();
        for (Tarea tarea : tareas) {
            if (filtro.aplica(tarea)) {
                aux.add(tarea);
            }
        }
        return aux;
    }

    // SERVICIO 4
    public ArrayList<String> getRecursosInvolucrados(Tarea t) {
        return t.recursosInvolucrados();
    }

    // SERVICIO 5
    public int duracionEstimada(Tarea t) {
        return t.duracionEstimada();
    }

    // SERVICIO 6
    public boolean esPosibleAsignar(Recurso x, Tarea y) {
        return y.puedeAsignar(x);
    }
}
