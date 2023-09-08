package ej1;

import java.util.ArrayList;

public class Coop_Agricultores {
    private ArrayList<Lote> lotes = new ArrayList<>();
    private ArrayList<Cereal> cereales = new ArrayList<>();

    public Coop_Agricultores() {

    }

    public void setCereal(Cereal cereal) {
        cereales.add(cereal);
    }

    public void setLote(Lote lote) {
        lotes.add(lote);
    }

    public static void main(String[] args) {

    }
}