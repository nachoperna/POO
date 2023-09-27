package ej5;

public class Ficha {
    private String nombre;
    private int fortaleza;
    private int espacio;
    private int destruccion;

    public Ficha(String nombre, int fortaleza, int espacio, int destruccion) {
        this.nombre = nombre;
        this.fortaleza = fortaleza;
        this.espacio = espacio;
        this.destruccion = destruccion;
    }

    public int getFortaleza() {
        return fortaleza;
    }

    public int getEspacio() {
        return espacio;
    }

    public int getDestruccion() {
        return destruccion;
    }

    @Override
    public String toString() {
        return "[Ficha:" + nombre + "]";
    }

}
