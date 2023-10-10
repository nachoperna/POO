package ej5;

import java.time.LocalDate;

import ej5.Filtros.FiltroAtraso;
import ej5.Filtros.FiltroFecha;
import ej5.Filtros.FiltroRecurso;
import ej5.Tareas.Recurso;
import ej5.Tareas.Tarea;
import ej5.Tareas.TareaTerminal;

public class Main {
    public static void main(String[] args) {
        WBS wbs = new WBS();
        Datos d = new Datos(wbs);

        // SERVICIO 1
        System.out.println(wbs.getLista(new FiltroFecha(LocalDate.now())));

        // SERVICIO 2
        System.out.println(wbs.getLista(new FiltroAtraso()));

        // SERVICIO 3
        System.out.println(wbs.getLista(new FiltroRecurso("Mesa")));

        // SERVICIO 4
        System.out.println(wbs.getRecursosInvolucrados(new TareaTerminal("Preparar Materiales", null, null)));

        // SERVICIO 5
        Tarea t = new TareaTerminal(null, null, null);
        System.out.println(wbs.duracionEstimada(t));

        // SERVICIO 6
        System.out.println(wbs.esPosibleAsignar(new Recurso("Mesa", null), t));
    }
}
