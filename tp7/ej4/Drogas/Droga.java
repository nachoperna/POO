package ej4.Drogas;

import java.util.ArrayList;
import java.util.Map;

public class Droga extends Componente {

    public Droga(String nombre, ArrayList<String> acciones_terapeuticas, ArrayList<String> contraindicaciones) {
        super(nombre);
        setAcciones_terapeuticas(acciones_terapeuticas);
        setContraindicaciones(contraindicaciones);
    }

    public void getPorcentaje(Map<Componente, Integer> drogas, Map<String, Integer> aux, int porcentaje) {
        aux.put(getNombre(), drogas.get(this) * porcentaje);
    }
}
