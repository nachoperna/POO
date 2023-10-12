package ej5;

import java.time.LocalDate;

public class Notificacion {
    private String mensaje;
    private LocalDate envio;
    private Empleado remitente;

    public Notificacion(String mensaje, LocalDate envio, Empleado remitente) {
        this.mensaje = mensaje;
        this.envio = envio;
        this.remitente = remitente;
    }

    public String getMensaje() {
        return mensaje;
    }

    public Empleado getRemitente() {
        return remitente;
    }
}
