package ej5.Ordenamiento;

import java.util.Comparator;

import ej5.Empleado;

public class OrdenaAscEdad implements Comparator<Empleado> {

    @Override
    public int compare(Empleado o1, Empleado o2) {
        if (o1.getEdad() < o2.getEdad()) {
            return 1;
        } else if (o1.getEdad() > o2.getEdad()) {
            return -1;
        }
        return 0;
    }

}
