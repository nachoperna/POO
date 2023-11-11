public class FiltroMarca implements Filtro {
    private String marca;

    public FiltroMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean cumple(Cartera c) {
        return c.getMarca().equals(marca);
    }

}
