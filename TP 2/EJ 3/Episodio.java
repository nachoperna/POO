public class Episodio {
    private String titulo;
    private String descripcion;
    private Boolean flag;
    private float calificacion;

    public Episodio(String t, String d) {
        titulo = t;
        descripcion = d;
        flag = false;
        calificacion = -1;
    }

    public Boolean loVio() {
        return flag;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
        flag = true;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Boolean getFlag() {
        return flag;
    }

    public String getTitulo() {
        return titulo;
    }

}
