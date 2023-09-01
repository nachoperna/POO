
import java.util.ArrayList;

public class Banco {
    private String nombre_banco;
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Cuenta> cuentas = new ArrayList<>();

    public Banco(String nombre) {
        nombre_banco = nombre;
    }

    public Boolean nuevoCliente(Cliente cliente) {
        for (Cliente c : clientes) {
            if (c.equals(cliente)) {
                return true;
            }
        }
        return false;
    }

    public void nuevaCuenta(Cliente cliente, float dinero) {
        int id = (int) Math.random();
        if (nuevoCliente(cliente)) {
            clientes.add(cliente);
        }
        Cuenta cuenta = new Cuenta(cliente, dinero, id);
        cuentas.add(cuenta);
        cliente.nuevaCuenta(cuenta);
    }

    public int operacion(Cliente cliente, int id) {
        int i = 0;
        while (cuentas.get(i).getId() != id) {
            i++;
        }
        if (cuentas.get(i).getTitular().equals(cliente)) {
            return i;
        }
        return -1;
    }

    public void deposito(Cliente cliente, float dinero, int id) {
        int i = operacion(cliente, id);
        if (i != -1) {
            cuentas.get(i).deposito(dinero);
        } else {
            System.out.println("Usted no posee una cuenta asociada en este Banco.");
        }
    }

    public void retiro(Cliente cliente, float dinero, int id) {
        int i = operacion(cliente, id);
        if (i != -1) {
            cuentas.get(i).retiro(dinero);
        } else {
            System.out.println("Usted no posee una cuenta asociada en este Banco.");
        }
    }

    public void listarSaldo(Cliente cliente, int id) {
        int i = operacion(cliente, id);
        if (i != -1) {
            System.out.println("Saldo: $" + cuentas.get(i).getSaldo());
        }
    }

    public void listarCuentas(Cliente cliente) {
        ArrayList<Cuenta> listado = cliente.getCuentas();
        for (Cuenta c : listado) {
            System.out.println(c);
        }
    }

    public void cerrarCuenta(Cliente cliente, int id) {
        int i = operacion(cliente, id);
        if (i != -1) {
            cuentas.remove(i);
        }
        cliente.borraCuenta(id);
    }

    public static void main(String[] args) {

    }
}
