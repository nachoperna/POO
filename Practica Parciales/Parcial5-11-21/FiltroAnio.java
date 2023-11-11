public class FiltroAnio implements Filtro {
    private int anio;

    public FiltroAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public boolean cumple(Cartera c) {
        return c.getAnio() < anio;
    }

}
