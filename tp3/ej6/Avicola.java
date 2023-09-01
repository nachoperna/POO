import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Avicola {
    private ArrayList<Producto> productosFrescos = new ArrayList<>();
    private ArrayList<Refrigerados> productosRefrigerados = new ArrayList<>();
    private ArrayList<Congelados> produCongelados = new ArrayList<>();

    public Avicola() {

    }

    public void addFresco(Producto producto) {
        productosFrescos.add(producto);
    }

    public void addRefrigerados(Refrigerados producto) {
        productosRefrigerados.add(producto);
    }

    public void addCongelados(Congelados producto) {
        produCongelados.add(producto);
    }

    public void muestraProductos() {
        for (Producto f : productosFrescos) {
            System.out.println(f);
        }
        for (Refrigerados r : productosRefrigerados) {
            System.out.println(r);
        }
        for (Congelados c : produCongelados) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        Avicola avicola = new Avicola();
        LocalDate env = LocalDate.now();
        LocalDate venc = LocalDate.of(2024, 1, 1);

        Producto huevos = new Producto("Huevos de gallina blancos", venc, env, (int) (Math.random() * 100), "Granja");
        avicola.addFresco(huevos);

        Refrigerados pollo = new Refrigerados("Milanesas de pollo", venc, env, (int) (Math.random() * 100), "Granja 1",
                (int) (Math.random() * 1000), 10);
        avicola.addRefrigerados(pollo);

        float nitrogeno = new Random().nextInt(16);
        float oxigeno = new Random().nextInt(16);
        float dioxido = new Random().nextInt(16);
        float vapor = new Random().nextInt(16);
        Congelados hamburguesas = new ConXAire("Hamburguesas", venc, env, (int) (Math.random() * 100), "Granja 2",
                (int) (Math.random() * 1000), 5, nitrogeno, oxigeno, dioxido, vapor);

        avicola.addCongelados(hamburguesas);

        avicola.muestraProductos();
    }
}
