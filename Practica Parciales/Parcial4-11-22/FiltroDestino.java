public class FiltroDestino implements Filtro {
    private String destino;

    public FiltroDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public boolean cumple(Elemento e) {
        return e.getDireccion().getCiudad().equals(destino);
    }

}
