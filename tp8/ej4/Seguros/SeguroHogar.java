package ej4.Seguros;

public class SeguroHogar extends Seguro {
    private float monto_fijo = (float) 50.000;
    private int porcentaje = 10;

    public SeguroHogar(int poliza, int dni_dueño, float monto_asegurado, String descripcion) {
        super(poliza, dni_dueño, monto_asegurado, descripcion);
        calculaCosto();
    }

    public SeguroHogar(int poliza, int dni_dueño, float monto_asegurado, String descripcion, float nuevo_monto_fijo,
            int nuevo_porcentaje) {
        super(poliza, dni_dueño, monto_asegurado, descripcion);
        monto_fijo = nuevo_monto_fijo;
        porcentaje = nuevo_porcentaje;
        calculaCosto();
    }

    @Override
    public void calculaCosto() {
        setCosto(monto_fijo + (getMonto_asegurado() * (porcentaje / 100)));
    }

}
