public class FiltroTema implements Filtro {
    private String tema;

    public FiltroTema(String tema) {
        this.tema = tema;
    }

    @Override
    public boolean cumple(Noticia n) {
        return n.getTema().equals(tema);
    }

}
