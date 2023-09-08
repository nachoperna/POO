package ej2;

import java.util.ArrayList;

public class Evaluador {
    private String nombre;
    private String clasificacion;
    private ArrayList<String> conocimientos = new ArrayList<>();
    private ArrayList<Trabajo> trabajos = new ArrayList<>();

    public Evaluador(String nombre) {
        this.nombre = nombre;
    }

    public void setConocimientos(ArrayList<String> conocimientos) {

        this.conocimientos = new ArrayList<>(conocimientos);
    }

    public Boolean esApto(Trabajo t) { // determina si puede aceptar el trabajo o no
        return t.esApto(conocimientos);
    }

    public void setClasificacion() {
        if ((conocimientos.contains("Algoritmos")) || (conocimientos.contains("Lenguajes de programacion"))) {
            clasificacion = "General";
        } else if ((conocimientos.contains("Agentes")) || (conocimientos.contains("Visualizacion"))
                || (conocimientos.contains("Redes de Comunicacion"))) {
            clasificacion = "Experto";
        } else {
            clasificacion = "nula";
        }
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void asignarTrabajo(Trabajo t) {
        trabajos.add(t);
    }

    public int getCantidadTrabajos() {
        return trabajos.size();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getConocimientos() {
        return new ArrayList<>(conocimientos);
    }

    public String toString() {
        return getNombre() + conocimientos.toString();
    }
}
