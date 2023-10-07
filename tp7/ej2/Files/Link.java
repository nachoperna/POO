package ej2.Files;

public class Link extends Sys {
    private Sys vinculo;

    public Link(String url, Sys vinculo) {
        super(url, 1);
        this.vinculo = vinculo;
    }

    public Sys getVinculo() {
        return vinculo;
    }

    @Override
    public String listar() {
        return vinculo.listar();
    }

    @Override
    public String toString() {
        return "Link: " + getNombre();
    }

}
