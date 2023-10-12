package ej4.Seguros;

public class SeguroVida extends Seguro {
    private int porcentaje;

    public SeguroVida(int poliza, int dni_dueño, float monto_asegurado, String descripcion) {
        super(poliza, dni_dueño, monto_asegurado, descripcion);
    }

    public SeguroVida(int poliza, int dni_dueño, float monto_asegurado, String descripcion, int nuevo_porcentaje) {
        super(poliza, dni_dueño, monto_asegurado, descripcion);
        porcentaje = nuevo_porcentaje;
    }

    @Override
    public void calculaCosto() {
        setCosto(getMonto_asegurado() * (porcentaje / 100));
    }

}
