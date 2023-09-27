package ej4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Agricola agricola = new Agricola();

        ArrayList<Object> estados = new ArrayList<>(null);
        estados.add("deshidratacion");
        estados.add("hojas amarillas");
        CaracComunes enfermedad = new CaracComunes("Cochinilla", estados);

        ProductoQuimico producto = new ProductoQuimico(null, estados, null);

        estados.clear();

        CaracComunes enfermedad1 = new CaracComunes("", estados);
        CaracComunes enfermedad2 = new CaracComunes("", estados);
        CaracComunes enfermedad3 = new CaracComunes("", estados);
        ArrayList<ProductoQuimico> cultivo;
        // CaracComunes cultivo = new CaracComunes("girasol");
        // cultivo.add(enfermedad1);
        // cultivo.add(enfermedad2);
        // cultivo.add(enfermedad3);

        // proveer listado de agroquimicos que traten enfermedad determinada
        // dado un cultivo y enfermedad devolver un listado de agroquimicos que puedan
        // utilizarse
    }
}
