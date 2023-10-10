package ej4.Filtros;

import java.util.Map;

import ej4.Drogas.Droga;
import ej4.Drogas.Medicamento;

public class FiltroPorcentaje implements Filtro {
    private int porcentaje;
    private Droga droga;

    public FiltroPorcentaje(int porcentaje, Droga droga) { // SERVICIO E
        this.porcentaje = porcentaje;
        this.droga = droga;
    }

    @Override
    public boolean aplica(Medicamento medicamento) {
        Map<String, Integer> lista_porcentajes = medicamento.porcentajeDroga(); // obtiene todos los porcentajes de
                                                                                // droga simples de un medicamento
        if (lista_porcentajes.containsKey(droga.getNombre())) { // verifica si el medicmaento contiene la droga que se
                                                                // pida
            if (lista_porcentajes.get(droga.getNombre()) > porcentaje) { // verifica que el porcentaje de esa droga
                                                                         // simple en el medicmaento sea mayor que el
                                                                         // porcentaje pedido
                return true;
            }
        }
        return false;
    }

}
