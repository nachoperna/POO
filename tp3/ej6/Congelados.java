import java.time.LocalDate;

public class Congelados extends Producto {
    private int codigo_supervision;
    private float temperatura_mantenimiento;

    public Congelados(String nombre, LocalDate vencimiento, LocalDate envasado, int lote, String granja,
            int codigo_supervision, float temperatura_mantenimiento) {
        super(nombre, vencimiento, envasado, lote, granja);
        this.codigo_supervision = codigo_supervision;
        this.temperatura_mantenimiento = temperatura_mantenimiento;
    }

    public String toString() {
        return super.toString() + "[Codigo_supervision: " + codigo_supervision + "] [Temperatura_mantenimiento: "
                + temperatura_mantenimiento + "] ";
    }
}
