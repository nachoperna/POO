package ej3;

public class EliminarPalabraPlugin extends GuardaTexto implements Plugin {
    private String a_eliminar;

    public EliminarPalabraPlugin(String texto, String a_eliminar) {
        super(texto);
        this.a_eliminar = a_eliminar;
    }

    @Override
    public void ejecutar() {
        setTexto(getTexto().replaceAll(a_eliminar, ""));
    }

    public String getPalabraEliminada() {
        return a_eliminar;
    }
}
