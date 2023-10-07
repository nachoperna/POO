package Transformaciones;

import Elementos.Elemento;
import Elementos.Parrafo;
import pPagina.Pagina;

public class Transformacion4 extends Transformacion {
    private String encabezado;

    public Transformacion4(String encabezado) {
        this.encabezado = encabezado;
    }

    @Override
    public void aplica(Pagina p) {
        Elemento e = new Parrafo(encabezado); // agrega encabezado al inicio de la pagina
        p.addElemento(0, e);
    }

}
