import java.time.LocalDate;

public class ConXAgua extends Congelados {
    private float salinidad; // en gramos de sal por litro de agua

    public ConXAgua(String nombre, LocalDate vencimiento, LocalDate envasado, int lote, String granja,
            int codigo_supervision, float temperatura_mantenimiento, float salinidad) {
        super(nombre, vencimiento, envasado, lote, granja, codigo_supervision, temperatura_mantenimiento);
        this.salinidad = salinidad;
    }

    public String toString() {
        return super.toString() + "[Salinidad: " + salinidad + "] ";
    }
}
