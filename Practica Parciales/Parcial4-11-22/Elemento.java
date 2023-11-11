import java.util.ArrayList;

public abstract class Elemento {
    private int tracking;

    public void setTracking(int tracking) {
        this.tracking = tracking;
    }

    public int getTracking() {
        return tracking;
    }

    public abstract String getDestinatario();

    public abstract float getPeso();

    public abstract String getRemitente();

    public abstract Direccion getDireccion();

    public abstract ArrayList<Envio> listar(Filtro filtro);
}