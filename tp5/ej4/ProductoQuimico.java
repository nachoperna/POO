package ej4;

import java.util.ArrayList;

public class ProductoQuimico extends CaracComunes {
    private ArrayList<String> estados_patologicos = new ArrayList<>();

    public ProductoQuimico(String nombre, ArrayList<Object> cultivos, ArrayList<String> estados) {
        super(nombre, cultivos);
        estados_patologicos = estados;
    }

    public ArrayList<String> getEstados_patologicos() {
        return estados_patologicos;
    }

}
