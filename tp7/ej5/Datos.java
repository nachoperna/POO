package ej5;

import ej5.Tareas.Tarea;
import ej5.Tareas.TareaCompuesta;
import ej5.Tareas.TareaTerminal;

public class Datos {
    public Datos(WBS system) {
        TareaCompuesta t1 = new TareaCompuesta("Preparar Materiales", null, null);
        t1.addTarea(new TareaTerminal("Comprar Pintura", null, null));
        t1.addTarea(new TareaTerminal("Comprar Pinceles", null, null));
        t1.addTarea(new TareaTerminal("Comprar Lijas", null, null));
        system.addTarea(t1);

        Tarea t2 = new TareaTerminal("Preparar el cuarto", null, null);
        system.addTarea(t2);

        TareaCompuesta t3 = new TareaCompuesta("Preparar paredes", null, null);
        t3.addTarea(new TareaTerminal("Remover empapelado", null, null));
        t3.addTarea(new TareaTerminal("Sacar decoracion desmontable", null, null));
        t3.addTarea(new TareaTerminal("Sacar apliques de luz", null, null));
        system.addTarea(t3);

        TareaCompuesta t4 = new TareaCompuesta("Proteger elementos", null, null);
        t4.addTarea(new TareaTerminal("Cubrir piso ", null, null));
        t4.addTarea(new TareaTerminal("Cubrir enchufes", null, null));
        t4.addTarea(new TareaTerminal("Cubrir muebles", null, null));
        system.addTarea(t4);

        Tarea t5 = new TareaTerminal("Pintar el cuarto", null, null);
        t4.addTareaPredecesora(t1);
        t4.addTareaPredecesora(t2);
        t4.addTareaPredecesora(t3);
        t4.addTareaPredecesora(t4);
        system.addTarea(t5);

        TareaCompuesta t6 = new TareaCompuesta("Limpiar el cuarto", null, null);
        t6.addTarea(new TareaTerminal("Guardar pintura que sobro", null, null));
        t6.addTarea(new TareaTerminal("Limpiar pinceles", null, null));
        t6.addTarea(new TareaTerminal("Desechar diarios", null, null));
        t6.addTareaPredecesora(t5);
        system.addTarea(t6);

        Tarea t7 = new TareaTerminal("Remover cobertores de muebles", null, null);
        t7.addTareaPredecesora(t6);
        system.addTarea(t7);

    }
}
