package ej5.Ordenamiento;

import java.util.Comparator;

import ej5.Empleado;

public class OrdenaNotifAsc implements Comparator<Empleado> {

    @Override
    public int compare(Empleado o1, Empleado o2) {
        if (o1.cantMensajes() > o2.cantMensajes()) {
            return 1;
        } else if (o1.cantMensajes() < o2.cantMensajes()) {
            return -1;
        } else {
            return 0;
        }
    }

}
