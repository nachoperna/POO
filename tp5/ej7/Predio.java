package ej7;

import java.util.ArrayList;
import java.util.Collections;

public class Predio {
    private ArrayList<Cancha> canchas = new ArrayList<>();
    private ArrayList<Socio> socios = new ArrayList<>();

    public Predio() {

    }

    public void newCancha(String deporte) {
        int id = (int) Math.random() * 1 + 100;
        float precio = (float) (Math.random() * 100 + 1000);
        Cancha cancha = new Cancha(deporte, id, precio);
        canchas.add(cancha);
    }

    public void alquilar(Socio socio, String deporte) {
        int i = 0;
        while ((i < canchas.size()) && (canchas.get(i).estaAlquilada()))  {
            i++;
        }
        if (i != canchas.size()) {
            canchas.get(i).setAlquiler(socio);
            socio.setAlquiler(canchas.get(i));
        } else {
            System.out.println("Lo siento, no hay cancha disponible");
        }
    }

    public ArrayList<Socio> servicioA() {
        ArrayList<Socio> aux = new ArrayList<>();
        for (Socio socio : socios) {
            if (!socio.pagoCuota()) {
                aux.add(socio);
            }
        }
        Collections.sort(aux, new CompA());
        return aux;
    }

    public ArrayList<Socio> servicioB() {
        ArrayList<Socio> aux = new ArrayList<>();
        for (Socio socio : socios) {
            if (socio.getEdad() < 18) {
                aux.add(socio);
            }
        }
        Collections.sort(aux, new CompB());
        return aux;
    }

    public ArrayList<Socio> servicioC() {
        ArrayList<Socio> aux = new ArrayList<>();
        for (Socio socio : socios) {
            if (socio.cantVecesAlquilada(13) != 0) {
                aux.add(socio);
            }
        }
        Collections.sort(aux, new CompC());
        return aux;
    }

    public ArrayList<Socio> servicioD() {
        ArrayList<Socio> aux1 = new ArrayList<>();
        ArrayList<Socio> aux2 = new ArrayList<>();
        for (Socio socio : socios) {
            if (socio.pagoMasDe(500)) {
                if (socio.pagoCuota()) {
                    aux1.add(socio);
                } else {
                    aux2.add(socio);
                }
            }
        }
        // ordenados alfabeticamente
        Collections.sort(aux1, new CompA());
        Collections.sort(aux2, new CompA());
        aux1.addAll(aux2);
        return aux1;
    }
    // public ArrayList<Socio> servicioE(){

    // }

}
