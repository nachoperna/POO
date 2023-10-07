package Transformaciones;

import pPagina.Pagina;

public class Transformacion6 extends Transformacion {
    private int porcentaje;

    public Transformacion6(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public void aplica(Pagina p) {
        p.cambiaTamanio(porcentaje); // reduce o aumenta dependiendo el signo de porcentaje
    }

}
