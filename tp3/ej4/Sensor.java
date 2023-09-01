public class Sensor {
    private String nombreArea;
    private Boolean vidrio_roto;
    private Boolean puerta_abierta;
    private Boolean ventana_abierta;
    private Boolean hay_movimiento;

    public Sensor(String n) {
        nombreArea = n;
        vidrio_roto = false;
        puerta_abierta = false;
        ventana_abierta = true;
        hay_movimiento = false;
    }

    public String getSensor() {
        return nombreArea;
    }

    public Boolean check() {
        return (vidrio_roto || puerta_abierta || ventana_abierta || hay_movimiento);
    }
}
