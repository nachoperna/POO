package ej4;

import java.util.ArrayList;

public class Casa {
    // COnjunto de cualidades
    private ArrayList<Alumno> alumnos = new ArrayList<>();
    private int capacidad;
    private Casa enemistada;

    public Casa(int capacidad) {
        this.capacidad = capacidad;
    }

    public void creaEnemistad(Casa enemiga) {
        enemistada = enemiga;
    }

    public Boolean tieneEnemistad() {
        return enemistada != null;
    }

    public Casa getEnemistada() {
        return enemistada;
    }

    public Boolean estaLlena() {
        return alumnos.size() == capacidad;
    }

    public void nuevoAlumno(Alumno alumno) {
        alumnos.add(alumno);
        alumno.setCasa_perteneciente(this);
    }

    public Boolean aceptaAlumno(Alumno alumno) {
        if (tieneEnemistad()) {
            if (!getEnemistada().aceptaAlumno(alumno) && !estaLlena() && poseeCualidades(alumno)) {
                nuevoAlumno(alumno);
                return true;
            }
        } else {
            if (!estaLlena() && poseeCualidades(alumno)) {
                nuevoAlumno(alumno);
                return true;
            }
        }
        return false;
    }

    public Boolean poseeCualidades(Alumno alumno) {
        // evalua si el alumno posee todas las cualidades de la casa que se evalua
        return true;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

}
