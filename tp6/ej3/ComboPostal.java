package ej3;

import java.util.ArrayList;

public class ComboPostal extends Envio {

    private ArrayList<Envio> envios_combo = new ArrayList<>();
    private int tracking = (int) Math.random() * 100 + 1000;

    public ComboPostal(Envio e) {
        super(e.getRemitente(), e.getDestinatario(), e.getRetiro(), e.getPeso());
        this.cambiaTracking(tracking);
        e.cambiaTracking(tracking);
        envios_combo.add(e);
    }

    public void addEnvio(Envio e) {
        if (e.getDestinatario().getCiudad() != envios_combo.get(0).getDestinatario().getCiudad()) {
            System.out.println("No se puede agregar el paquete porque no pertenece a la ciudad DESTINO de este combo");
        } else {
            e.cambiaTracking(tracking);

        }
    }

    public void cambiaTracking(int x) {
        for (Envio envio : envios_combo) {
            envio.cambiaTracking(x);
        }
    }

    public float getPeso() {
        float x = 0;
        for (Envio envio : envios_combo) {
            x += envio.getPeso();
        }
        return x;
    }
}
