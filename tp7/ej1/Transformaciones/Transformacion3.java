package Transformaciones;

import java.time.LocalDate;

import Elementos.Elemento;
import Elementos.Parrafo;
import pPagina.Pagina;

public class Transformacion3 extends Transformacion {

    @Override
    public void aplica(Pagina p) {
        LocalDate hoy = LocalDate.now();
        Elemento e = new Parrafo("" + hoy); // agrega fecha actual al final de pagina
        p.addElemento(e);
    }

}
