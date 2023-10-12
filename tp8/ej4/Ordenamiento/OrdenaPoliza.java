package ej4.Ordenamiento;

import java.util.Comparator;

import ej4.Seguros.Seguro;

public class OrdenaPoliza implements Comparator<Seguro> {

    @Override
    public int compare(Seguro o1, Seguro o2) {
        if (o1.getPoliza() < o2.getPoliza()) {
            return 1;
        } else { // las polizas nunca van a ser iguales
            return -1;
        }
    }

}
