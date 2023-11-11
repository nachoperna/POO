import java.util.ArrayList;

public class Combo extends Elemento { // Combo Empresarial y Combo Servicios no necesarios por mismom comportamiento
    private ArrayList<Elemento> envios = new ArrayList<>();
    private Filtro agrega;

    public Combo(Filtro agrega, int tracking) {
        this.agrega = agrega;
        super.setTracking(tracking);
    }

    public void addEnvio(Elemento envio) {
        if (agrega.cumple(envio)) { // agrega si cumple el filtro de agregado
            envio.setTracking(getTracking()); // cambia el tracking por el del combo
            envios.add(envio);
        }
    }

    @Override
    public String getDestinatario() {
        return envios.get(0).getDestinatario();
    }

    @Override
    public float getPeso() {
        float x = 0;
        for (Elemento envio : envios) {
            x += envio.getPeso();
        }
        return x;
    }

    @Override
    public String getRemitente() {
        return envios.get(0).getRemitente();
    }

    @Override
    public Direccion getDireccion() {
        return envios.get(0).getDireccion();
    }

    @Override
    public ArrayList<Envio> listar(Filtro filtro) {
        ArrayList<Envio> aux = new ArrayList<>();
        for (Elemento envio : envios) {
            aux.addAll(envio.listar(filtro));
        }
        return aux;
    }

}
