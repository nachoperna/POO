package ej7;

import java.sql.Date;

public class Cancha {
    private String deporte;
    private int id;
    private float precio;
    private boolean alquilada;
    private Socio socio;
    private Date fecha_alquiler;

    public Cancha(String deporte, int id, float precio) {
        this.deporte = deporte;
        this.id = id;
        this.precio = precio;
        alquilada = false;
    }

    public void setAlquiler(Socio socio) {
        alquilada = true;
        this.socio = socio;
        // fecha_alquiler = tiempo ahora
    }

    public String getDeporte() {
        return deporte;
    }

    public int getId() {
        return id;
    }

    public float getPrecio() {
        return precio;
    }

    public boolean estaAlquilada() {
        // if (fecha_alquiler esta pasada por 1 hora){
        // alquilada = false;
        // }
        return alquilada;
    }

    public Socio getSocio() {
        return socio;
    }

}
