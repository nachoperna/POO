import java.util.ArrayList;

import Operaciones.Operacion;

public class CongresoAritmetico {

    public CongresoAritmetico() {

    }

    // SERVICIO A
    public float operar(Operacion o) {
        return o.resultado();
    }

    // SERVICIO B
    public ArrayList<Float> obtenerValores(Operacion o) {
        ArrayList<Float> lista = new ArrayList<>();
        lista.add(o.getValor1());
        lista.add(o.getValor2());
        return lista;
    }

    // SERVICIO C
    public ArrayList<String> obtenerOperadores(Operacion o) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add(o.obtenerOperador());
        return lista;
    }
}
