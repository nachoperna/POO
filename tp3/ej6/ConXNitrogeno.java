import java.time.LocalDate;

public class ConXNitrogeno extends Congelados {
    private String metodo_congelacion;
    private int tiempo_exposicioin_nitrogeno; // en segundos

    public ConXNitrogeno(String nombre, LocalDate vencimiento, LocalDate envasado, int lote, String granja,
            int codigo_supervision, float temperatura_mantenimiento,
            String metodo, int exposicion) {
        super(nombre, vencimiento, envasado, lote, granja, codigo_supervision, temperatura_mantenimiento);
        metodo_congelacion = metodo;
        tiempo_exposicioin_nitrogeno = exposicion;
    }

    public String toString() {
        return super.toString() + "[Metodo_congelacion: " + metodo_congelacion + "] [Tiempo_exposicion_nitrogeno: "
                + tiempo_exposicioin_nitrogeno + "] ";
    }
}
