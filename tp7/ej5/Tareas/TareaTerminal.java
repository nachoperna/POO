package ej5.Tareas;

import java.time.LocalDate;
import java.util.ArrayList;

public class TareaTerminal extends Tarea {
    private ArrayList<Recurso> recursos; // Recursos: nombre, tiempo disponible

    public TareaTerminal(String nombre, LocalDate inicio_estimado, LocalDate final_estimado) {
        super(nombre, inicio_estimado, final_estimado);

    }

    @Override
    public void addRecurso(Recurso r) {
        recursos.add(r);
    }

    @Override
    public boolean utilizaRecurso(String r) {
        boolean x = false;
        for (Recurso recurso : recursos) {
            if (recurso.getRecurso() == r) {
                x = true;
            }
        }
        return x;
    }

    @Override
    public ArrayList<String> recursosInvolucrados() {
        ArrayList<String> aux = new ArrayList<>();
        for (Recurso recurso : recursos) {
            aux.add(recurso.getRecurso());
        }
        return aux;
    }

}
