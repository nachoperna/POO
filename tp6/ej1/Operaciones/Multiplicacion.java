package Operaciones;

public class Multiplicacion extends Operacion {

    public Multiplicacion(float x, float y) {
        super(x, y);
    }

    public Multiplicacion(float x, Operacion o1) {
        super(x, o1);
    }

    public Multiplicacion(Operacion o1, Operacion o2) {
        super(o1, o2);
    }

    @Override
    public float resultado() {
        return getValor1() * getValor2();
    }

    @Override
    public String obtenerOperador() {
        return "*";
    }

}
