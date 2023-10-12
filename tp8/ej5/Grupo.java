package ej5;

import java.util.ArrayList;

import ej5.Filtros.Filtro;

public class Grupo extends Persona {
    private ArrayList<Persona> empleados = new ArrayList<>();
    private Filtro f;

    public Grupo(String nombre, Filtro filtro) {
        super(nombre);
        cambiaFiltro(filtro);
    }

    public void cambiaFiltro(Filtro filtro) {
        f = filtro;
    }

    public int cantMensajes() {
        int x = 0;
        for (Persona persona : empleados) {
            x += persona.cantMensajes();
        }
        return x;
    }

    @Override
    public void recibeMensaje(Notificacion notificacion) {
        if (f.aplica(notificacion)) {
            for (Persona persona : empleados) {
                persona.recibeMensaje(notificacion);
            }
        }
    }

    @Override
    public int getCantidad() {
        int x = 0;
        for (Persona persona : empleados) {
            x += persona.getCantidad();
        }
        return x;
    }

    @Override
    public void listar(ArrayList<Empleado> aux) {
        for (Persona empleado : empleados) {
            empleado.listar(aux);
        }
    }
}
