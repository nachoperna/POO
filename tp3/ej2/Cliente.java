import java.util.ArrayList;

public class Cliente {
    String nombre;
    int dni;
    int nro_cliente;
    private ArrayList<Cuenta> cuentas = new ArrayList<>();

    public Cliente(String nombre, int dni, int nro_cliente) {
        this.nombre = nombre;
        this.dni = dni;
        this.nro_cliente = nro_cliente;
    }

    public void nuevaCuenta(Cuenta c) {
        cuentas.add(c);
    }

    public void borraCuenta(int id) {
        for (Cuenta c : cuentas) {
            if (c.getId() == id) {
                cuentas.remove(c);
            }
        }
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNro_cliente() {
        return nro_cliente;
    }

}
