package ej7;

import java.util.Comparator;

public class CompB implements Comparator<Socio> {

    @Override
    public int compare(Socio s1, Socio s2) {
        return s1.getEdad() - s2.getEdad();
    }

}
