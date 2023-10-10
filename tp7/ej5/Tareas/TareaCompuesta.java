package ej5.Tareas;

import java.time.LocalDate;
import java.util.ArrayList;

public class TareaCompuesta extends Tarea {
    private ArrayList<Tarea> subTareas = new ArrayList<>();

    public TareaCompuesta(String nombre, LocalDate inicio_estimado, LocalDate final_estimado) {
        super(nombre, inicio_estimado, final_estimado);

    }

    public void addTarea(Tarea t) {
        subTareas.add(t);
    }

    public LocalDate getInicio_estimado() { // el inicio mas temprano de todas sus tareas
        LocalDate aux = subTareas.get(0).getInicio_estimado();
        for (Tarea tarea : subTareas) {
            if (tarea.getInicio_estimado().isBefore(aux)) {
                aux = tarea.getInicio_estimado();
            }
        }
        return aux;
    }

    public LocalDate getFinalizacion_estimada() { // la finalizacion mas tardia de todas sus tareas
        LocalDate aux = subTareas.get(0).getFinal_estimado();
        for (Tarea tarea : subTareas) {
            if (tarea.getFinal_estimado().isAfter(aux)) {
                aux = tarea.getFinal_estimado();
            }
        }
        return aux;
    }

    @Override
    public void addRecurso(Recurso r) {
        for (Tarea tarea : subTareas) {
            tarea.addRecurso(r);
        }
    }

    @Override
    public boolean utilizaRecurso(String r) {
        boolean x = false;
        for (Tarea tarea : subTareas) {
            if (tarea.utilizaRecurso(r)) {
                x = true;
            }
        }
        ;
        return x;
    }

    @Override
    public ArrayList<String> recursosInvolucrados() {
        ArrayList<String> aux = new ArrayList<>();
        for (Tarea tarea : subTareas) {
            aux.addAll(tarea.recursosInvolucrados());
        }
        return aux;
    }

}
