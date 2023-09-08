package ej1;

import java.util.ArrayList;

public class Lote {
    // minerales caracteristicos del lote
    private ArrayList<Cereal> sembrado = new ArrayList<>();
    private float hectareas;
    private String clasificacion;

    public Lote() {
        // setea los minerales aptos para el sembrado en ese lote
        // setea las hectareas
        // setea su clasificacion "especial" o "comun"
    }

    public Boolean satisface(Cereal c) {
        if (c instanceof Pasturas) { // si el cereal es una pastura y el lote es menor a 50 hectareas no puede
                                     // sembrarse
            if (getHectareas() < 50) {
                return false;
            }
        }
        Boolean x = false;
        // chequea todas los minerales del cereal con los minerales propios del lote
        return x;
    }

    public void siembra(Cereal c) {
        sembrado.add(c);
    }

    public float getHectareas() {
        return hectareas;
    }

    public String getClasificacion() {
        return clasificacion;
    }
}
