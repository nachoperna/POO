package ej5;

public class NotificadorSms implements Notificador {
    private String numeroTelefono;

    public NotificadorSms(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public void enviarNotificacion(String s) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'enviarNotificacion'");
    }

    @Override
    public String getNotificacion() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNotificacion'");
    }

}
