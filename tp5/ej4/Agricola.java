package ej4;

import java.util.ArrayList;

public class Agricola {
    private ArrayList<ProductoQuimico> agroquimicos = new ArrayList<>();

    public ArrayList<ProductoQuimico> primerServicio(CaracComunes enfermedad) {
        ArrayList<ProductoQuimico> productos = new ArrayList<>();

        for (ProductoQuimico productoQuimico : agroquimicos) {
            if (productoQuimico.getEstados_patologicos().containsAll(enfermedad.getLista())) {
                productos.add(productoQuimico);
            }
        }
        return productos;
    }

    public ArrayList<ProductoQuimico> segundoServicio(CaracComunes cultivo, CaracComunes enfermedad) {
        ArrayList<ProductoQuimico> productos = new ArrayList<>();

        for (ProductoQuimico productoQuimico : agroquimicos) {
            if ((!productoQuimico.getLista().contains(cultivo.getNombre()))
                    && (productoQuimico.getEstados_patologicos().containsAll(enfermedad.getLista()))) {
                productos.add(productoQuimico);
            }
        }

        return productos;
    }

}
