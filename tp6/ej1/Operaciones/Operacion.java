package Operaciones;

public abstract class Operacion {
    private float valor1, valor2;

    public Operacion(float x, float y) {
        valor1 = x;
        valor2 = y;
    }

    public Operacion(float x, Operacion o1) {
        valor1 = x;
        valor2 = o1.resultado();
    }

    public Operacion(Operacion o1, Operacion o2) {
        valor1 = o1.resultado();
        valor2 = o2.resultado();
    }

    public float getValor1() {
        return valor1;
    }

    public float getValor2() {
        return valor2;
    }

    public abstract String obtenerOperador();

    public String obtenerExpresion() {
        return "(" + getValor1() + " " + obtenerOperador() + " " + getValor2() + ")";
    }

    public abstract float resultado();
}
