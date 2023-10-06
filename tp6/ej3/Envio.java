package ej3;

public class Envio {
    private Direccion remitente;
    private Direccion destinatario;
    private int tracking;
    private boolean retiroEnDomicilio;
    private float peso;

    public Envio(Direccion remitente, Direccion destinatario, boolean retiraEnDomicilio, float peso) {
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.tracking = (int) Math.random() * 100 + 1000;
        retiroEnDomicilio = retiraEnDomicilio;
        this.peso = peso;
    }

    public Direccion getRemitente() {
        return remitente;
    }

    public Direccion getDestinatario() {
        return destinatario;
    }

    public int getTracking() {
        return tracking;
    }

    public boolean getRetiro() {
        return retiroEnDomicilio;
    }

    public float getPeso() {
        return peso;
    }

    public void cambiaTracking(int x) {
        tracking = x;
    }
}
