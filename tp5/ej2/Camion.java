package ej2;

import java.sql.Date;

public class Camion extends Transporte {
    private Date fechaCarga;

    public Camion(float cantCereal, Date fechaCarga) {
        super(cantCereal);
        this.fechaCarga = fechaCarga;
    }

    public Date getFechaCarga() {
        return fechaCarga;
    }

    public String toString() {
        return "[Cereal: " + getCantCereal() + ", Carga: " + getFechaCarga() + "]";
    }

    @Override
    public int comparar(Object t1, Object t2) {
        return (int) Math.floor(((Camion) t1).getFechaCarga().compareTo(((Camion) (t2)).getFechaCarga()));
    }
}
