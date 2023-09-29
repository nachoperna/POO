package ej7;

import java.util.Comparator;

public class CompA implements Comparator<Socio> {

    @Override
    public int compare(Socio s1, Socio s2) {
        int res = compara(s1, s2);
        if (res == 0) {
            return s1.getApellido().compareTo(s2.getApellido());
        }
        return res;
    }

    public int compara(Socio s1, Socio s2) {
        return s1.getNombre().compareTo(s2.getNombre());
    }

}
