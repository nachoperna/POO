package Elementos;

import pPagina.Pagina;

public class Vinculo extends Elemento {
    private Pagina vinculo;

    public Vinculo(Pagina pagina) {
        super(pagina.getTamanio());
        this.vinculo = pagina;
    }

    public Pagina getVinculo() {
        return vinculo;
    }

    @Override
    public int getTamanio() {
        return vinculo.getTamanio();
    }

    @Override
    public void cambiaTamanio(int porcentaje) {
        vinculo.cambiaTamanio(porcentaje);
    }

}
