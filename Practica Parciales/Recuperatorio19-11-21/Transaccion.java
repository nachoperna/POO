import java.time.LocalDate;

public class Transaccion implements Busqueda {
    private Cuenta remitente;
    private Cuenta destinatario;
    private float monto;
    private LocalDate fecha;

    public Transaccion(Cuenta remitente, Cuenta destinatario, float monto) {
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.monto = monto;
        setFecha(LocalDate.now());
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Transaccion copia() {
        Transaccion copia = new Transaccion(getRemitente(), getDestinatario(), getMonto());
        copia.setFecha(getFecha());
        return copia;
    }

    public Cuenta getDestinatario() {
        return destinatario;
    }

    public float getMonto() {
        return monto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public int getNumero() {
        return remitente.getNumero();
    }

    public Cuenta getRemitente() {
        return remitente;
    }

}
