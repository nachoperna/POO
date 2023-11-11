public class Vehiculo extends Cartera {
    private String marca;
    private float precio;
    private int anio;

    public Vehiculo(String marca, float precio, int anio) {
        this.marca = marca;
        this.precio = precio;
        this.anio = anio;
    }

    @Override
    public float getPrecio() {
        return precio;
    }

    @Override
    public int getAnio() {
        return anio;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public int contar() {
        return 1;
    }

    @Override
    public Vehiculo copia(Filtro f) {
        if (f.cumple(this)) {
            return new Vehiculo(getMarca(), getPrecio(), getAnio());
        }
        return null;
    }

}
