package ej2;

public class Link extends Sys {
    private Sys vinculo;

    public Link(String nombre, Sys vinculo) {
        super(nombre, 1);
        this.vinculo = vinculo;
    }

    public Sys getVinculo() {
        return vinculo;
    }

}
