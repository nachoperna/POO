import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.getTransacciones(new FiltroNOT(new FiltroMontoMayor(500)));
        banco.getTransacciones(new FiltroMontoMayor(10000));
        banco.getTransacciones(new FiltroNumero(40344));
        banco.getTransacciones(new FiltroFecha(LocalDate.now()));
    }
}
