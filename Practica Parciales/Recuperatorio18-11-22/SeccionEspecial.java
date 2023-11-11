import java.util.ArrayList;
import java.util.Collections;

public class SeccionEspecial extends Seccion { // Ahorra crear por separado UltimoMomento y Qatar 2022
    private String nombre;
    private int cantPalClaves;

    public SeccionEspecial(String nombre, int cantPalClaves) {
        this.nombre = nombre;
        this.cantPalClaves = cantPalClaves;
    }

    public String getCategoria() {
        return nombre;
    }

    public ArrayList<String> getPalabras_clave() {
        ArrayList<String> aux = super.getPalabras_clave();
        Collections.sort(aux); // ordena alfabeticamente
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < cantPalClaves; i++) {
            res.add(aux.get(i)); // obtiene las primeras 5
        }
        return res;
    }
}
