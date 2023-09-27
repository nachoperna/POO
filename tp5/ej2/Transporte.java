package ej2;

public abstract class Transporte {
    private float cantCereal;

    public Transporte(float cantCereal) {
        this.cantCereal = cantCereal;
    }

    public float getCantCereal() {
        return cantCereal;
    }

    public abstract int comparar(Object t1, Object t2);
}
