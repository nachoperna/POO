package ej4.Seguros;

import java.util.ArrayList;

import ej4.Filtros.Filtro;

public class SeguroIntegrador extends Seguro {
    private ArrayList<Seguro> seguros = new ArrayList<>();

    public SeguroIntegrador(int dni_dueño, String descripcion, ArrayList<Seguro> seguros) {
        super(calculaPoliza(seguros), dni_dueño, calculaMonto(seguros), descripcion);
        this.seguros = seguros;
    }

    public static float calculaMonto(ArrayList<Seguro> seguros) {
        float x = 0;
        for (Seguro seguro : seguros) {
            x += seguro.getMonto_asegurado();
        }
        return x;
    }

    public static int calculaPoliza(ArrayList<Seguro> seguros) {
        int x = seguros.get(0).getPoliza();
        for (Seguro seguro : seguros) {
            if (seguro.getPoliza() > x) {
                x = seguro.getPoliza();
            }
        }
        return x;
    }

    public void agregaAlistado(ArrayList<Seguro> aux, Filtro filtro) {
        for (Seguro seguro : seguros) {
            seguro.agregaAlistado(aux, filtro);
        }
    }

    @Override
    public void calculaCosto() {
        float x = 0;
        for (Seguro seguro : seguros) {
            x += seguro.getCosto();
        }
        setCosto(x);
    }

}
