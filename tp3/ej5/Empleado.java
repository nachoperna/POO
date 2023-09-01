
public class Empleado {
    private String nombre;
    private int legajo;
    private float salario;
    private float horas_trabajadas = 0;

    public Empleado(String nombre, int legajo, float salario) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.salario = salario;
    }

    public void setHoras(float cant) {
        horas_trabajadas += cant;
    }

    public float getHoras_trabajadas() {
        return horas_trabajadas;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPago() {
        return salario;
    }
}
