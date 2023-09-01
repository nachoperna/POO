import java.util.ArrayList;

public class Alarma {
    private ArrayList<Sensor> sensores = new ArrayList<>();
    private AlarmaLuminosa luminosa = new AlarmaLuminosa();

    public Alarma() {

    }

    public void addSensor(String area) {
        Sensor s = new Sensor(area);
        sensores.add(s);
    }

    public Boolean activaAlarma(ArrayList<Sensor> sens) {
        for (Sensor s : sensores) {
            if (s.check()) {
                sens.add(s);
            }
        }
        if (sens.isEmpty()) {
            return false;
        }
        return true;
    }

    public void comprobar() {
        ArrayList<Sensor> sens = new ArrayList<>();
        if (activaAlarma(sens)) {
            luminosa.enciende();
            for (Sensor s : sens) {
                System.out.println(s.getSensor());
            }
        }
    }

    public static void main(String[] args) {
        Alarma alarma = new Alarma();
        alarma.addSensor("Living");
        alarma.addSensor("Cocina");
        alarma.addSensor("Habitaciones");
        alarma.addSensor("Garage");
        alarma.comprobar();
    }
}
