package Transformaciones;

import Elementos.Elemento;
import Elementos.Parrafo;
import pPagina.Pagina;

public class Transformacion2 extends Transformacion {

    @Override
    public void aplica(Pagina p) {

        Elemento e = new Parrafo("" + p.getElementos().size()); // agrega cantidad de componentes de la pagina
        p.addElemento(e);
    }

}
