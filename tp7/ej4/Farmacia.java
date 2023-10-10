package ej4;

import java.util.ArrayList;
import java.util.Map;

import ej4.Drogas.Componente;
import ej4.Drogas.Medicamento;
import ej4.Filtros.Filtro;

public class Farmacia {
    private ArrayList<Medicamento> medicamentos = new ArrayList<>();

    public Farmacia() {

    }

    public void addMedicamento(Medicamento medicamento) {
        medicamentos.add(medicamento);
    }

    // SERVICIOS A B C Y E
    public ArrayList<Componente> busquedaMedicamentos(Filtro filtro) {
        ArrayList<Componente> aux = new ArrayList<>();
        for (Medicamento medicamento : medicamentos) {
            if (filtro.aplica(medicamento)) {
                aux.add(medicamento);
            }
        }
        return aux;
    }

    // SERVICIOS D
    public void porcentajesDroga(Medicamento m) {
        Map<String, Integer> lista = m.porcentajeDroga();

        for (Map.Entry<String, Integer> entry : lista.entrySet()) {
            String droga = entry.getKey();
            System.out.println("Droga: " + droga + " (" + lista.get(droga) + " %)");
        }
    }
}
