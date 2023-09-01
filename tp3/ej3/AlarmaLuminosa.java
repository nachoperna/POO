
public class AlarmaLuminosa extends Alarma {

    public void comprueba() {
        if (super.comprobar()) {
            System.out.print("acciona");
            Luz luz = new Luz();
            luz.encender();
            Timbre timbre = new Timbre();
            timbre.hacerSonar();
        }
    }
}
