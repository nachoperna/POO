public class FiltroPrecio implements Filtro {
    private float precio;

    public FiltroPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public boolean cumple(Cartera c) {
        return c.getPrecio() < precio;
    }

}
