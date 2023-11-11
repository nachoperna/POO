import java.util.ArrayList;

public class Cuenta extends General implements Busqueda {
    private String titular;
    private int numero;
    private float saldo;
    private ArrayList<Transaccion> transacciones = new ArrayList<>();

    public Cuenta(String titular, float saldo) {
        this.titular = titular;
        this.saldo = saldo;
        numero = (int) Math.random();
    }

    @Override
    public void deposito(Filtro filtro, float monto) {
        saldo += monto;
    }

    @Override
    public void extraccion(Filtro filtro, float monto) {
        if (monto <= saldo) {
            saldo -= monto;
        }
    }

    public void nuevaTransaccion(Transaccion t) {
        transacciones.add(t);
        extraccion(null, t.getMonto());
    }

    @Override
    public int getNumero() {
        return numero;
    }

    @Override
    public ArrayList<Transaccion> getTransacciones(Filtro filtro) {
        ArrayList<Transaccion> aux = new ArrayList<>();
        for (Transaccion transaccion : aux) {
            if (filtro.cumple(transaccion)) {
                aux.add(transaccion.copia());
            }
        }
        return aux;
    }

    @Override
    public boolean deshacerTransaccion(Filtro filtro) {
        boolean x = false;
        for (Transaccion transaccion : transacciones) {
            if (filtro.cumple(transaccion)) {
                x = true;
                transaccion.getDestinatario().extraccion(null, transaccion.getMonto()); // se quita al destinatario el
                                                                                        // monto recibido
                this.deposito(null, transaccion.getMonto()); // se deposito al remitente el monto transferido
                transacciones.remove(transaccion); // se borra la transferencia
            }
        }
        return x;
    }

    public String getTitular() {
        return titular;
    }

}
