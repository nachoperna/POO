import java.time.LocalDate;

public class Producto {
    private String nombre;
    private LocalDate vencimiento;
    private LocalDate envasado;
    private int lote;
    private String granja_origen;

    public Producto() {

    }

    public Producto(String nombre, LocalDate vencimiento, LocalDate envasado, int lote, String granja) {
        this.nombre = nombre;
        this.vencimiento = vencimiento;
        this.envasado = envasado;
        this.lote = lote;
        this.granja_origen = granja;
    }

    public String toString() {
        return "[Nombre: " + nombre + "] [Vencimiento: " + vencimiento + "] [Envasado: " + envasado + "] [Lote: " + lote
                + "] [Granja: " + granja_origen + "] ";
    }
}
