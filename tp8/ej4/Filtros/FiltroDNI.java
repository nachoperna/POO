package ej4.Filtros;

import ej4.Seguros.Seguro;

public class FiltroDNI extends Filtro {
    private int dni;

    public FiltroDNI(int dni) {
        this.dni = dni;
    }

    @Override
    public boolean aplica(Seguro seguro) {
        return dni == seguro.getDni_dueño();
    }

}
