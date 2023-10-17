package ej3;

public class ContadorOcurrenciasPlugin extends GuardaTexto implements Plugin {
    private String palabra;
    private int cantOcurrencias;

    public ContadorOcurrenciasPlugin(String texto, String palabra) {
        super(texto);
        this.palabra = palabra;
    }

    @Override
    public void ejecutar() {
        String palabras[] = getTexto().split("\\s");
        for (String x : palabras) {
            if (x.equals(palabra)) {
                cantOcurrencias++;
            }
        }
    }

    public int getCantOcurrencias() {
        return cantOcurrencias;
    }

    public String getPalabra() {
        return palabra;
    }
}
