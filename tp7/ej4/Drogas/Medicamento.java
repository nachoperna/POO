package ej4.Drogas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Medicamento extends Componente {
    private Map<Componente, Integer> drogas = new HashMap<>(); // <Medicamente, % de ese medicamento>
    private int porcentaje = 1;

    public Medicamento(String nombre, Map<Componente, Integer> drogas) {
        super(nombre);
        this.drogas = drogas;
        setAyC(); // setea acciones y contraindicaciones
    }

    public void setAyC() {
        ArrayList<String> aux = new ArrayList<>();
        ArrayList<String> aux2 = new ArrayList<>();
        for (Map.Entry<Componente, Integer> entry : drogas.entrySet()) {
            Componente droga = entry.getKey();
            aux.addAll(droga.getAcciones_terapeuticas());
            aux2.addAll(droga.getContraindicaciones());
        }
        setAcciones_terapeuticas(aux);
        setContraindicaciones(aux2);
    }

    public boolean trataPaciente(ArrayList<String> drogas_prohibidas, ArrayList<String> sintomas, Enfermedad e) {
        boolean x = true;
        for (Map.Entry<Componente, Integer> entry : drogas.entrySet()) {
            Componente droga = entry.getKey();
            if (drogas_prohibidas.contains(droga.getNombre()) || getContraindicaciones().contains(sintomas)) {
                x = false;
            }
        }
        return x;
    }

    public Map<String, Integer> porcentajeDroga() {
        Map<String, Integer> aux = new HashMap<>();
        for (Map.Entry<Componente, Integer> entry : drogas.entrySet()) {
            Componente droga = entry.getKey();
            if (aux.containsKey(droga.getNombre())) { // si se encuentran 2 porcentajes distintos de una misma droga se
                                                      // realiza la cuenta
                int porcentaje_anterior = aux.get(droga.getNombre()); // ej: Paracetamol, 50 %
                int porcentaje_nuevo = porcentaje_anterior + (drogas.get(this) * porcentaje); // Paracetamol
                                                                                              // en
                                                                                              // Medicamento
                                                                                              // B = 80 % *
                                                                                              // 0,5 = 40 +
                                                                                              // 50 = 90 %
                aux.replace(droga.getNombre(), porcentaje_nuevo); // reemplaza Paracetamol (50 %) por Paracetamol (90 %)
            } else {
                droga.getPorcentaje(drogas, aux, porcentaje);
            }
        }
        return aux;
    }

    public void getPorcentaje(Map<Componente, Integer> drogas, Map<String, Integer> aux, int porcentaje) { // devuelve
                                                                                                           // el
                                                                                                           // porcentaje
        porcentaje = drogas.get(this) / 100;
    }
}
