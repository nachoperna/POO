public class FiltroRemitente implements Filtro {
    private String remitente;

    public FiltroRemitente(String remitente) {
        this.remitente = remitente;
    }

    @Override
    public boolean cumple(Elemento e) {
        return e.getRemitente().equals(remitente);
    }

}
