package ej3;

public class ReemplazoTextoPlugin extends GuardaTexto implements Plugin {
    private String a_remplazar;
    private String remplazo;

    public ReemplazoTextoPlugin(String texto, String a_remplazar, String remplazo) {
        super(texto);
        this.a_remplazar = a_remplazar;
        this.remplazo = remplazo;
    }

    @Override
    public void ejecutar() {
        setTexto(getTexto().replaceFirst(a_remplazar, remplazo));
    }

}
