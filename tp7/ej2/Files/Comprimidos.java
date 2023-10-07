package ej2.Files;

import java.util.ArrayList;

public class Comprimidos extends Sys {
    private ArrayList<Sys> files = new ArrayList<>();
    private float tasaCompresion; // en porcentaje

    public Comprimidos(String nombre, Sys file, float tasaCompresion) {
        super(nombre, 0);
        this.tasaCompresion = tasaCompresion;
        addFile(file);
    }

    public void addFile(Sys file) {
        file.cambiaTamanio(file.getTamanio() * ((100 - tasaCompresion) / 100)); // comprime el tamaño del archivo
        files.add(file);
        this.cambiaTamanio(file.getTamanio());
    }

    @Override
    public String listar() {
        String path = getNombre();
        return path;
    }

    @Override
    public String toString() {
        return "Comp: " + getNombre();
    }
}
