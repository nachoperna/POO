package ej4.Drogas;

import java.util.ArrayList;
import java.util.Map;

public abstract class Componente {
    private String nombre;
    private ArrayList<String> acciones_terapeuticas = new ArrayList<>();
    private ArrayList<String> contraindicaciones = new ArrayList<>();

    public Componente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setAcciones_terapeuticas(ArrayList<String> acciones_terapeuticas) {
        this.acciones_terapeuticas = acciones_terapeuticas;
    }

    public void setContraindicaciones(ArrayList<String> contraindicaciones) {
        this.contraindicaciones = contraindicaciones;
    }

    public ArrayList<String> getAcciones_terapeuticas() {
        return acciones_terapeuticas;
    }

    public ArrayList<String> getContraindicaciones() {
        return contraindicaciones;
    }

    public boolean trataEnfermedad(Enfermedad e) {
        return acciones_terapeuticas.containsAll(e.getAcciones_terapeuticas());
    }

    public void getPorcentaje(Map<Componente, Integer> drogas, Map<String, Integer> aux, int porcentaje) {
    }
}
