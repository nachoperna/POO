package ej3;

public class Direccion {
    private String ciudad;
    private String calle;
    private int altura;

    public Direccion(String ciudad, String calle, int altura) {
        this.ciudad = ciudad;
        this.calle = calle;
        this.altura = altura;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public int getAltura() {
        return altura;
    }

}
