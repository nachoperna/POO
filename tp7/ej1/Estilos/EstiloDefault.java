package Estilos;

import Transformaciones.Transformacion;
import Transformaciones.Transformacion1;
import Transformaciones.Transformacion3;
import Transformaciones.Transformacion6;

public class EstiloDefault extends Estilo {
    public EstiloDefault() {
        Transformacion t1 = new Transformacion1();
        Transformacion t3 = new Transformacion3();
        Transformacion t6 = new Transformacion6(-20);

        addTransformacion(t1);
        addTransformacion(t3);
        addTransformacion(t6);
    }
}
