public class Vinculo extends Elemento {
    private Pagina vinculo;

    public Vinculo(int posicion, Pagina pagina) {
        super(posicion, pagina.getTamanio());
        this.vinculo = pagina;
    }

    @Override
    public int getTamanio() {
        return vinculo.getTamanio();
    }

}
