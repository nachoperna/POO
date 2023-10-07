package ej2.Files;

import java.util.ArrayList;

public class Directorio extends Sys {
    private ArrayList<Sys> archivos = new ArrayList<>();

    public Directorio(String nombre) {
        super(nombre, 0);
    }

    public void addArchivo(Sys arch) {
        archivos.add(arch);
        this.cambiaTamanio(arch.getTamanio());
    }

    public int getElementos() {
        return archivos.size();
    }

    @Override
    public String listar() {
        String path = getNombre();
        for (Sys file : archivos) {
            path += "/" + file.getNombre();
        }
        return path;
    }

    @Override
    public String toString() {
        return "Dir: " + getNombre();
    }
}
