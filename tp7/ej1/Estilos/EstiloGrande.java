package Estilos;

import Transformaciones.Transformacion;
import Transformaciones.Transformacion3;
import Transformaciones.Transformacion6;

public class EstiloGrande extends Estilo {
    public EstiloGrande() {
        Transformacion t3 = new Transformacion3();
        Transformacion t7 = new Transformacion6(20);
        addTransformacion(t3);
        addTransformacion(t7);
    }
}
