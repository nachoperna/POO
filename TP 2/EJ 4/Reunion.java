import java.util.ArrayList;

public class Reunion {
    private ArrayList<Contacto> participantes = new ArrayList<>();
    private String lugar;
    private String tema;
    private int inicio;
    private int fin;

    public Reunion(String L, int i, int f, String T) {
        lugar = L;
        inicio = i;
        fin = f;
        tema = T;
    }

    public void addAsistente(Contacto p) {
        participantes.add(p);
    }

    public int getFin() {
        return fin;
    }

    public int getInicio() {
        return inicio;
    }

    public String getLugar() {
        return lugar;
    }

    public ArrayList<Contacto> getParticipantes() {
        return participantes;
    }

    public String getTema() {
        return tema;
    }

}
