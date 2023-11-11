public class FiltroContenido implements Filtro {
    private String frase;

    public FiltroContenido(String frase) {
        this.frase = frase;
    }

    @Override
    public boolean cumple(Elemento e) {
        return ((Noticia) (e)).getContenido().contains(frase);
    }

}
