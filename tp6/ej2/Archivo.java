package ej2;

import java.time.LocalDate;

public class Archivo extends Sys {
    LocalDate ult_modificacion;

    public Archivo(String nombre, float tamanio) {
        super(nombre, tamanio);
        ult_modificacion = LocalDate.now();
    }

}
