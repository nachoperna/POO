import java.time.LocalDate;

public class ConXAire extends Congelados {
    private float porcentaje_N;
    private float porcentaje_O2;
    private float porcentaje_CO2;
    private float porcentaje_vaporAgua;

    public ConXAire(String nombre, LocalDate vencimiento, LocalDate envasado, int lote, String granja,
            int codigo_supervision, float temperatura_mantenimiento, float nitrogeno,
            float oxigeno, float dioxido, float vapor) {
        super(nombre, vencimiento, envasado, lote, granja, codigo_supervision, temperatura_mantenimiento);
        porcentaje_N = nitrogeno;
        porcentaje_CO2 = dioxido;
        porcentaje_O2 = oxigeno;
        porcentaje_vaporAgua = vapor;
    }

    public String toString() {
        return super.toString() + "[% Nitrogeno: " + porcentaje_N + "] [% Oxigeno: " + porcentaje_O2 + "] [% Dioxido: "
                + porcentaje_CO2 + "] [% Vapor Agua: " + porcentaje_vaporAgua + "] ";
    }
}
