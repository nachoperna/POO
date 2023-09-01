
public class AlarmaLuminosa {

    public AlarmaLuminosa() {

    }

    public void enciende() {
        Luz luz = new Luz();
        luz.encender();
        Timbre timbre = new Timbre();
        timbre.hacerSonar();
    }

}
