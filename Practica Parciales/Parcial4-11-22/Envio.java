import java.util.ArrayList;

public class Envio extends Elemento {
    private Direccion direccion_destinatario;
    private Direccion direccion_remitente;
    private boolean retira_sucursal;
    private float peso;

    public Envio(Direccion direccion_destinatario,
            Direccion direccion_remitente, boolean retira_sucursal, float peso) {
        this.direccion_destinatario = direccion_destinatario;
        this.direccion_remitente = direccion_remitente;
        this.retira_sucursal = retira_sucursal;
        this.peso = peso;
    }

    public Envio copiar() {
        return new Envio(getDireccion(), direccion_remitente, retira_sucursal,
                getPeso());
    }

    public Direccion getDireccion_remitente() {
        return direccion_remitente;
    }

    @Override
    public String getDestinatario() {
        return direccion_destinatario.getPersona();
    }

    @Override
    public float getPeso() {
        return peso;
    }

    @Override
    public String getRemitente() {
        return direccion_remitente.getPersona();
    }

    @Override
    public Direccion getDireccion() {
        return direccion_destinatario;
    }

    @Override
    public ArrayList<Envio> listar(Filtro filtro) {
        if (filtro.cumple(this)) {
            ArrayList<Envio> aux = new ArrayList<>();
            aux.add(this);
            return aux;
        }
        return new ArrayList<>();
    }

}
