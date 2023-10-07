package ej2.Files;

import java.time.LocalDate;

public class Archivo extends Sys {
    LocalDate ult_modificacion;
    private String creador;

    public Archivo(String nombre, float tamanio, String creador) {
        super(nombre, tamanio);
        ult_modificacion = LocalDate.now();
        this.creador = creador;
    }

    public String getCreador() {
        return creador;
    }

    @Override
    public String listar() {
        String path = getNombre();
        return path;
    }

    @Override
    public String toString() {
        return "Arch: " + getNombre();
    }

}
