package Operaciones;

public class Division extends Operacion {

    public Division(float x, float y) {
        super(x, y);
    }

    public Division(float x, Operacion o1) {
        super(x, o1);
    }

    public Division(Operacion o1, Operacion o2) {
        super(o1, o2);
    }

    @Override
    public float resultado() {
        return getValor1() / getValor2();
    }

    @Override
    public String obtenerOperador() {
        return "/";
    }

}
