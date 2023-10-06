package ej2;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Sys> files = new ArrayList<>();
    private ArrayList<Directorio> directorios = new ArrayList<>();

    public Sistema() {

    }

    public void addFile(Sys file) {
        files.add(file);
    }

    // SERVICIO A (busca directorio por nombre)
    public int cantElementos(String nombre) {
        for (Directorio file : directorios) {
            if (file.getNombre() == nombre) {
                return file.getElementos();
            }
        }
        return 0;
    }

    // SERVICIO B
    public float tamanioTotal(String nombre) {
        for (Directorio file : directorios) {
            if (file.getNombre() == nombre) {
                return file.getTamanio();
            }
        }
        return 0;
    }
}
