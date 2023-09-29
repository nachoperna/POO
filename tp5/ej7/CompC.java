package ej7;

import java.util.Comparator;

public class CompC implements Comparator<Socio> {

    @Override
    public int compare(Socio s1, Socio s2) {
        return s1.getAlquileres_x_cancha() - s2.getAlquileres_x_cancha();
    }

}
