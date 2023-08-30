import java.util.ArrayList;

public class Celular {
    private ArrayList<Contacto> contactos = new ArrayList<>();
    private ArrayList<Contacto> repetidos = new ArrayList<>();
    private float promedioEdad;

    public Celular() {

    }

    public Boolean esRepetido(Contacto c1) {
        Boolean r = false;
        for (Contacto c : contactos) {
            if ((c.getNombre().equals(c1.getNombre())) && (c.getTelefono() == c1.getTelefono())) {
                r = true;
            }
        }
        return r;
    }

    public void infoContactos() {
        for (Contacto c : contactos) {
            System.out.println(c);
            if (esRepetido(c)) {
                repetidos.add(c);
            }
            ;
            this.promedioEdad += c.getEdad();
        }
        System.out.println(promedioEdad);
        System.out.println(repetidos);
    }

    public float promedio() {
        return (this.promedioEdad / (contactos.size() - repetidos.size()));
    }

}
