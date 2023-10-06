package Operaciones;

public class Potencia extends Operacion {

    public Potencia(float x, float y) {
        super(x, y);
    }

    public Potencia(float x, Operacion o1) {
        super(x, o1);
    }

    public Potencia(Operacion o1, Operacion o2) {
        super(o1, o2);
    }

    @Override
    public float resultado() {
        return (float) Math.pow(getValor1(), getValor2());

    }

    @Override
    public String obtenerOperador() {
        return "pot";
    }

}
