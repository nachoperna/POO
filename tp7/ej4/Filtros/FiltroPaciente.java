package ej4.Filtros;

import java.util.ArrayList;

import ej4.Drogas.Enfermedad;
import ej4.Drogas.Medicamento;

public class FiltroPaciente extends FiltroEnfermedad implements Filtro {
    private ArrayList<String> drogas_prohibidas = new ArrayList<>();
    private ArrayList<String> sintomas = new ArrayList<>();

    public FiltroPaciente(ArrayList<String> drogas_prohibidas, ArrayList<String> sintomas, Enfermedad enfermedad) { // SERVICIO
                                                                                                                    // B
        super(enfermedad);
        this.drogas_prohibidas = drogas_prohibidas;
        this.sintomas = sintomas;
    }

    @Override
    public boolean aplica(Medicamento m) {
        return m.trataPaciente(drogas_prohibidas, sintomas, getEnfermedad());
    }

}
