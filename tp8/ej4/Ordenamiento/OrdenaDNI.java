package ej4.Ordenamiento;

import java.util.Comparator;

import ej4.Seguros.Seguro;

public class OrdenaDNI implements Comparator<Seguro> {

    @Override
    public int compare(Seguro o1, Seguro o2) {
        if (o1.getDni_dueño() < o2.getDni_dueño()) {
            return 1;
        } else if (o1.getDni_dueño() > o2.getDni_dueño()) {
            return -1;
        } else {
            return new OrdenaPoliza().compare(o1, o2); // si los seguros pertenecen al mismo dueÑo, compara por polizas
        }
    }

}
