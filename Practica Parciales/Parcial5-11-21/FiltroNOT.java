public class FiltroNOT implements Filtro {
    private Filtro f;

    public FiltroNOT(Filtro f) {
        this.f = f;
    }

    @Override
    public boolean cumple(Cartera c) {
        return !f.cumple(c);
    }

}
