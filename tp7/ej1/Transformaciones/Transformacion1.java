package Transformaciones;

import Elementos.Elemento;
import Elementos.Parrafo;
import pPagina.Pagina;

public class Transformacion1 extends Transformacion {

    @Override
    public void aplica(Pagina p) {
        Elemento elem = new Parrafo("" + p.getTamanio());
        p.addElemento(elem); // lo agrega al final de la pagina (final de la lista de elementos)
    }

}
