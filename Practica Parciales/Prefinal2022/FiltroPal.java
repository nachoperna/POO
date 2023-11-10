public class FiltroPal implements Filtro {
    private String pal;

    public FiltroPal(String pal) {
        this.pal = pal;
    }

    @Override
    public boolean cumple(Noticia n) {
        return n.getPalabrasClave().contains(pal);
    }

}
