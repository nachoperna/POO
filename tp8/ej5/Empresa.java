package ej5;

import java.util.ArrayList;
import java.util.Comparator;

import ej5.Filtros.Filtro;

public class Empresa {
    private ArrayList<Persona> empleados = new ArrayList<>();

    public Empresa() {

    }

    // SERVICIO 1
    public int cantEmpleados(Grupo g) {
        return g.getCantidad();
    }

    // SERVICIO 2
    public ArrayList<Empleado> listado(Comparator<Empleado> comp) {
        ArrayList<Empleado> aux = new ArrayList<>();
        for (Persona persona : empleados) {
            persona.listar(aux);
        }
        aux.sort(comp);
        return aux;
    }

    // SERVICIO 3
    public void modificaFiltro(Grupo g, Filtro f) {
        g.cambiaFiltro(f);
    }

    // SERVICIO 4 y 5
    public ArrayList<Empleado> listado(Filtro filtro, Comparator<Empleado> comp) {
        ArrayList<Empleado> aux = listado(comp);
        for (Empleado empleado : aux) {
            ArrayList<Notificacion> notis = empleado.getNotificaciones();
            int i = 0;
            while ((i < notis.size()) && (!filtro.aplica(notis.get(i)))) {
                i++;
            }
            if (i < notis.size()) { // significa que encontro una notificacion que pasa el filtro
                aux.add(empleado);
            }
        }
        aux.sort(comp);
        return aux;
    }

    // SERVICIO 6
    public int cantMensajes(Grupo g) {
        return g.cantMensajes();
    }
}
