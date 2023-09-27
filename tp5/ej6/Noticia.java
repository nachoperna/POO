package ej6;

public class Noticia {
    private String titulo;
    private String clasificacion;
    private Object cuerpo;

    public Noticia(String titulo, String clasificacion, Object cuerpo) {
        this.titulo = titulo;
        this.clasificacion = clasificacion;
        this.cuerpo = cuerpo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public Object getCuerpo() {
        return cuerpo;
    }
}
