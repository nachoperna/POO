package ej4;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    // COnjunto de cualidades
    private ArrayList<Alumno> familiares = new ArrayList<>(); // familiares que asisten a la escuela
    private Casa casa_perteneciente;

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Alumno> getFamiliares() {
        return familiares;
    }

    public void setCasa_perteneciente(Casa casa_perteneciente) {
        this.casa_perteneciente = casa_perteneciente;
    }

}
