package ej5;

import java.util.ArrayList;

public abstract class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract int cantMensajes();

    public abstract void recibeMensaje(Notificacion notificacion);

    public abstract int getCantidad();

    public abstract void listar(ArrayList<Empleado> aux);
}
