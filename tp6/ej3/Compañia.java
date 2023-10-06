package ej3;

import java.util.ArrayList;

public class Compañia {
    private ArrayList<Envio> envios = new ArrayList<>();

    public Compañia() {

    }

    public void nuevoEnvio(Envio e) {
        envios.add(e);
    }
}
