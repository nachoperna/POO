import java.util.ArrayList;

public class EmpresaInformatica {
    private String nombre;
    private ArrayList<Empleado> empleados = new ArrayList<>();

    public EmpresaInformatica(String n) {
        nombre = n;
    }

    public void newEmpleado(Empleado emp) {
        empleados.add(emp);
    }

    public void sumaHoras(int legajo, float horas) {
        int i = 0;
        while (empleados.get(i).getLegajo() != legajo) {
            i++;
        }
        empleados.get(i).setHoras(horas);
    }

    public void sumaVentas(int legajo, int ventas) {
        int i = 0;
        while (empleados.get(i).getLegajo() != legajo) {
            i++;
        }
        empleados.get(i).setVenta(ventas);
    }

    public void pagos() {
        for (Empleado emp : empleados) {
            System.out.println("Empleado: " + emp.getNombre() + " - Salario: $" + emp.getPago());
        }
    }

    public static void main(String[] args) {
        EmpresaInformatica empresa = new EmpresaInformatica("Oracle");

        Empleado emp = new EmpContratado("Juan", (int) Math.random(), 20000);
        empresa.newEmpleado(emp);
        emp.setHoras((int) Math.random());

        emp = new EmpHoraExtra("Carlos", (int) Math.random(), 20000);
        empresa.newEmpleado(emp);
        emp.setHoras((int) Math.random());

        emp = new EmpComision("Alberto", (int) Math.random(), 20000);
        empresa.newEmpleado(emp);
        emp.setVenta((int) Math.random());

        empresa.pagos();

    }
}
