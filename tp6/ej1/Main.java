import Operaciones.Division;
import Operaciones.Multiplicacion;
import Operaciones.Operacion;
import Operaciones.Potencia;
import Operaciones.Resta;
import Operaciones.Suma;

public class Main {
    public static void main(String[] args) {
        CongresoAritmetico congreso = new CongresoAritmetico();

        Operacion o1 = new Multiplicacion(5, new Suma(2, 3));
        Operacion o2 = new Potencia(new Suma(5, 5), new Resta(3, 1));
        Operacion o3 = new Division(new Suma(7, 8), new Resta(5, 3));

        // SERVICIO A
        System.out.println("- SERVICIO A -");
        System.out.println("((2+3)*5) = " + congreso.operar(o1));
        System.out.println("(5+5)^(3-1) = " + congreso.operar(o2));
        System.out.println("(7+8)/(5-3) = " + congreso.operar(o3));

        // SERVICIO B
        System.out.println("\n- SERVICIO B -");
        System.out.println("Lista o1 = " + congreso.obtenerValores(o1));
        System.out.println("Lista o2 = " + congreso.obtenerValores(o2));
        System.out.println("Lista o3 = " + congreso.obtenerValores(o3));

        // SERVICIO C
        System.out.println("\n- SERVICIO C -");
        System.out.println("Operadores o1 = " + congreso.obtenerOperadores(o1));
        System.out.println("Operadores o2 = " + congreso.obtenerOperadores(o2));
        System.out.println("Operadores o3 = " + congreso.obtenerOperadores(o3));

        // SERVICIO D
        System.out.println("\n- SERVICIO D -");
        System.out.println("Operadores o1 = " + o1.obtenerExpresion());
        System.out.println("Operadores o2 = " + o2.obtenerExpresion());
        System.out.println("Operadores o3 = " + o3.obtenerExpresion());
    }
}
