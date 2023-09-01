
public class Alarma {
    private Boolean vidrio_roto;
    private Boolean puerta_abierta;
    private Boolean ventana_abierta;
    private Boolean hay_movimiento;

    public Alarma() {
        vidrio_roto = false;
        puerta_abierta = false;
        ventana_abierta = false;
        hay_movimiento = false;
    }

    public Boolean comprobar() {
        return (vidrio_roto || puerta_abierta || ventana_abierta || hay_movimiento);
    }

    public static void main(String[] args) {

    }
}
