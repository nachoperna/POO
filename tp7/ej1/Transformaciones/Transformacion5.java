package Transformaciones;

import Elementos.Elemento;
import Elementos.Parrafo;
import pPagina.Pagina;

public class Transformacion5 extends Transformacion {
    private String pie_pagina;

    public Transformacion5(String pie_pagina) {
        this.pie_pagina = pie_pagina;
    }

    @Override
    public void aplica(Pagina p) {
        Elemento e = new Parrafo(pie_pagina); // agrega pie de pagina
        p.addElemento(e);
    }

}
