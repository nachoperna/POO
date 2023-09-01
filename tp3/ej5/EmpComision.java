
public class EmpComision extends Empleado {
    private float porcentaje = 15;
    private int ventas = 0;
    private float precio_venta = 300;

    public EmpComision(String nombre, int legajo, float salario) {
        super(nombre, legajo, salario);
    }

    public void setVenta(int x) {
        ventas += x;
    }

    public float getPago() {
        return super.getPago() + ((ventas * precio_venta) * porcentaje) / 100;
    }
}
