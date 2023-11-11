import java.util.ArrayList;

public class Banco extends General {
    private ArrayList<General> cuentas = new ArrayList<>();

    public Banco() {

    }

    public void nuevaCuenta(General cuenta) {
        cuentas.add(cuenta);
    }

    public void cierraCuenta(Filtro filtro) {
        for (General cuenta : cuentas) {
            if (filtro.cumple((Busqueda) cuenta)) {
                cuentas.remove(cuenta);
            }
        }
    }

    public General busqueda(Filtro filtro) {
        for (General cuenta : cuentas) {
            if (filtro.cumple((Busqueda) cuenta)) {
                return cuenta;
            }
        }
        return null;
    }

    @Override
    public void deposito(Filtro filtro, float monto) {
        General cuenta = busqueda(filtro);
        if (cuenta != null) {
            cuenta.deposito(filtro, monto);
        }
    }

    @Override
    public void extraccion(Filtro filtro, float monto) {
        General cuenta = busqueda(filtro);
        if (cuenta != null) {
            cuenta.extraccion(filtro, monto);
        }
    }

    // @Override
    public void transferencia(Filtro f1, Filtro f2, float monto) {
        Cuenta remitente = (Cuenta) busqueda(f1);
        Cuenta destinatario = (Cuenta) busqueda(f2);
        if (remitente != null && destinatario != null) {
            remitente.nuevaTransaccion(new Transaccion(remitente, destinatario, monto));
        }
    }

    @Override
    public ArrayList<Transaccion> getTransacciones(Filtro filtro) {
        ArrayList<Transaccion> aux = new ArrayList<>();
        for (General cuenta : cuentas) {
            aux.addAll(cuenta.getTransacciones(filtro));
        }
        return aux;
    }

    @Override
    public boolean deshacerTransaccion(Filtro filtro) {
        boolean x = false;
        for (General cuenta : cuentas) {
            x = cuenta.deshacerTransaccion(filtro);
            if (x) {
                break;
            }
        }
        return x;
    }

}
