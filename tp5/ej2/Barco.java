package ej2;

public class Barco extends Transporte {
    private float capacidad;

    public Barco(float cantCereal, float capacidad) {
        super(cantCereal);
        this.capacidad = capacidad;
    }

    public float getCapacidad() {
        return capacidad;
    }

    public String toString() {
        return "[Cereal: " + getCantCereal() + ", Capacidad: " + getCapacidad() + "]";
    }

    @Override
    public int comparar(Object t1, Object t2) {
        return (int) Math.floor(((Barco) t1).getCapacidad() - ((Barco) t2).getCapacidad());
    }

}
