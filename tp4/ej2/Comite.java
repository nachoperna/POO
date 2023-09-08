package ej2;

import java.util.ArrayList;

public class Comite {
    private ArrayList<Evaluador> evaluadores = new ArrayList<>();
    private ArrayList<Trabajo> trabajos = new ArrayList<>();

    public Comite() {

    }

    public void nuevoEvaluador(Evaluador e) {
        e.setClasificacion();
        evaluadores.add(e);
    }

    public void nuevoTrabajo(Trabajo t) {
        trabajos.add(t);
    }

    public Evaluador getEvaluador(Trabajo t) { // 1) qué evaluador puede asignarse a un determinado trabajo
        for (Evaluador e : evaluadores) {
            if (e.esApto(t)) {
                return e;
            }
        }
        return null;
    }

    public ArrayList<Trabajo> getTrabajos(Evaluador e) { // 2) qué trabajos pueden asignarse un evaluador particular
        ArrayList<Trabajo> lista = new ArrayList<>();
        for (Trabajo t : trabajos) {
            if (e.esApto(t)) {
                lista.add(t);
            }
        }
        return lista;
    }

    public int getCantidadTrabajos(String nombre) { // 3) Cuantos trabajos tiene un evaluador determinado
        for (Evaluador e : evaluadores) {
            if (e.getNombre() == nombre) {
                return e.getCantidadTrabajos();
            }
        }
        return -1;
    }

    public String getClasificacion(String nombre) { // 4) Determinar si un evaluador dado es general o experto
        for (Evaluador e : evaluadores) {
            if (e.getNombre() == nombre) {
                return e.getClasificacion();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Comite comite = new Comite();

        Evaluador evaluador1 = new Evaluador("Carlos");
        ArrayList<String> conocimientos = new ArrayList<>();
        conocimientos.add("campo");
        conocimientos.add("sembrado");
        conocimientos.add("semillas");
        evaluador1.setConocimientos(conocimientos);

        comite.nuevoEvaluador(evaluador1);

        ArrayList<String> palabras_clave = new ArrayList<>();
        palabras_clave.add("campo");
        palabras_clave.add("sembrado");
        palabras_clave.add("semillas");
        Trabajo t1 = new Articulo(palabras_clave);
        comite.nuevoTrabajo(t1);

        palabras_clave = new ArrayList<>();
        palabras_clave.add("tecnologia");
        palabras_clave.add("programacion");
        palabras_clave.add("ciencia");
        Trabajo t2 = new Resumen(palabras_clave);
        comite.nuevoTrabajo(t2);

        palabras_clave = new ArrayList<>();
        palabras_clave.add("animales");
        palabras_clave.add("biologia");
        palabras_clave.add("ciencia");
        Trabajo t3 = new Poster(palabras_clave);
        comite.nuevoTrabajo(t3);

        Evaluador evaluador2 = new Evaluador("Juan");
        conocimientos = new ArrayList<>();
        conocimientos.add("animales");
        conocimientos.add("dinero");
        conocimientos.add("politica");
        evaluador2.setConocimientos(conocimientos);
        comite.nuevoEvaluador(evaluador2);

        System.out.println("1) " + comite.getEvaluador(t1));
        System.out.println("2) " + comite.getTrabajos(evaluador2));
        System.out.println("3) ");
        System.out.println("4) " + comite.getClasificacion("Carlos"));
    }
}
