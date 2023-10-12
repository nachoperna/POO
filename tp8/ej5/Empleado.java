package ej5;

import java.util.ArrayList;

public class Empleado extends Persona {
    private ArrayList<Notificacion> notificaciones = new ArrayList<>();
    private int legajo;
    private int edad;

    public Empleado(String nombre, int edad) {
        super(nombre);
        legajo = (int) Math.random() * 100 + 300;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public int cantMensajes() {
        return notificaciones.size();
    }

    public ArrayList<Notificacion> getNotificaciones() {
        return notificaciones;
    }

    @Override
    public void recibeMensaje(Notificacion notificacion) {
        if (!notificaciones.contains(notificacion)) {
            notificaciones.add(notificacion);
        }
    }

    @Override
    public int getCantidad() {
        return 1;
    }

    @Override
    public void listar(ArrayList<Empleado> aux) {
        if (!aux.contains(this)) { // si es empleado nuevo en la lista se agrega
            aux.add(this);
        }
    }

}
