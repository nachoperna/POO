
public class EmpContratado extends Empleado {
    public EmpContratado(String nombre, int legajo, float salario) {
        super(nombre, legajo, salario);
    }

    public float getPago() {
        return super.getPago();
    }
}
