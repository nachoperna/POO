
public class EmpHoraExtra extends Empleado {
    private float montoExtra = 100;

    public EmpHoraExtra(String nombre, int legajo, float salario) {
        super(nombre, legajo, salario);
    }

    public float getPago() {
        return super.getPago() + (super.getHoras_trabajadas() * montoExtra);
    }
}
