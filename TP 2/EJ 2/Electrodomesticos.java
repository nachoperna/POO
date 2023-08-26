public class Electrodomesticos {
    private String nombre;
    private float precio;
    private String color;
    private int consumo; // en Kw
    private float peso; // en Kg

    public Electrodomesticos(String n, float p, String c, int con, float pe) {
        nombre = n;
        precio = p;
        color = c;
        consumo = con;
        peso = pe;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public int getConsumo() {
        return consumo;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPeso() {
        return peso;
    }

    public float getPrecio() {
        return precio;
    }

    public Boolean bajoConsumo() {
        return consumo < 45;
    }

    public float balance() {
        return precio / peso;
    }

    public Boolean altaGama() {
        return balance() > 3;
    }

    public String toString() {
        return "[Nombre: " + nombre + "] [Precio: " + precio + "] [Color: " + color + "] [Consumo: " + consumo
                + "] [Peso: " + peso + "] [bajoConsumo: " + bajoConsumo() + "] [balance: " + balance() + "] [altaGama: "
                + altaGama() + "]";
    }

    public static void main(String[] args) {
        Electrodomesticos electrodomestico = new Electrodomesticos(null, 100, "Gris Plata", 10, 2);
        System.out.println(electrodomestico);
    }
}