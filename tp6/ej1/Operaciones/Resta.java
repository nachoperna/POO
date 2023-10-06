package Operaciones;

public class Resta extends Operacion {

    public Resta(float x, float y) {
        super(x, y);
    }

    public Resta(float x, Operacion o1) {
        super(x, o1);
    }

    public Resta(Operacion o1, Operacion o2) {
        super(o1, o2);
    }

    @Override
    public float resultado() {
        return getValor1() - getValor2();
    }

    @Override
    public String obtenerOperador() {
        return "-";
    }

}
