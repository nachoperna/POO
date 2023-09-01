
public class Cuenta {
    private int id;
    private Cliente titular;
    private float saldo;

    public Cuenta(Cliente cliente, float dinero, int id) {
        this.id = id;
        titular = cliente;
        saldo = dinero;
    }

    public void deposito(float monto) {
        saldo += monto;
    }

    public void retiro(float monto) {
        saldo -= monto;
    }

    public int getId() {
        return id;
    }

    public float getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public String toString() {
        return "[ID: " + id + "] [SALDO: " + saldo + "]";
    }
}
