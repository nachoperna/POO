package Estilos;

import java.util.ArrayList;

import Transformaciones.Transformacion;
import pPagina.Pagina;

public class Estilo {
    private ArrayList<Transformacion> transformaciones = new ArrayList<>();

    public void tranformaPag(Pagina p) {
        for (Transformacion t : transformaciones) {
            t.aplica(p); // aplica transformacion a la pagina p
        }
    }

    public void addTransformacion(Transformacion t) {
        transformaciones.add(t);
    }
}
