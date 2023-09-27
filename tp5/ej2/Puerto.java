package ej2;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;

public class Puerto {
    private ArrayList<Transporte> camiones = new ArrayList<>();
    private ArrayList<Transporte> barcos = new ArrayList<>();

    public Puerto() {

    }

    public void datos() {
        // genera todos los datos random de barcos y camiones
        for (int i = 0; i < 8; i++) {
            int mes = (int) Math.random() * 1 + 12;
            int dia = (int) Math.random() * 1 + 30;
            Transporte c = new Camion((float) (Math.random() * 50 + 300), new Date(2023, mes, dia));
            camiones.add(c);

            Transporte b = new Barco((float) Math.random() * 50 + 300, (float) Math.random() * 50 + 300);
            barcos.add(b);
        }
    }

    public void print() {
        System.out.println("Camiones: ");
        for (Transporte camion : camiones) {
            System.out.println(camion);
        }
        System.out.println("\nBarcos: ");
        for (Transporte barco : barcos) {
            System.out.println(barco);
        }
    }

    public void colaPrioridad() {
        // ordena la cola de prioridad de mayor a menor con el discernible negativo
        Collections.sort(camiones, new Comparador(-1));
        Collections.sort(barcos, new Comparador(-1));
    }

}
