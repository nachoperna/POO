package ej7;

import java.util.ArrayList;

public class Socio {
    private String nombre;
    private String apellido;
    private int edad;
    private boolean cuota_paga;
    private ArrayList<Cancha> alquileres = new ArrayList<>();
    private int alquileres_x_cancha = 0;

    public Socio(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void setAlquiler(Cancha c) {
        alquileres.add(c);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public boolean pagoCuota() {
        return cuota_paga;
    }

    public ArrayList<Cancha> getAlquileres() {
        return alquileres;
    }

    public int cantVecesAlquilada(int id) {
        for (Cancha cancha : alquileres) {
            if (cancha.getId() == id) {
                alquileres_x_cancha++;
            }
        }
        return alquileres_x_cancha;
    }

    public int getAlquileres_x_cancha() {
        return alquileres_x_cancha;
    }

    public boolean pagoMasDe(float precio) {
        for (Cancha cancha : alquileres) {
            if (cancha.getPrecio() >= precio) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "[Socio =" + nombre + " " + apellido + ", Edad =" + edad + "]";
    }

}
