package ej2;

import java.util.ArrayList;

public class Directorio extends Sys {
    private ArrayList<Archivo> archivos = new ArrayList<>();
    private ArrayList<Directorio> sub_directorios = new ArrayList<>();

    public Directorio(String nombre) {
        super(nombre, 0);
    }

    public void addArchivo(Archivo a) {
        archivos.add(a);
        this.cambiaTamanio(a.getTamanio());
    }

    public void addSubDirectorio(Directorio d) {
        sub_directorios.add(d);
        this.cambiaTamanio(d.getTamanio());
    }

    public int getElementos() {
        return archivos.size() + sub_directorios.size();
    }
}
