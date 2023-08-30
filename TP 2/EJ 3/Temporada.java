import java.util.ArrayList;

public class Temporada {

    private ArrayList<Episodio> episodios = new ArrayList<>();

    public Temporada(int cantEpisodios) {
        for (int i = 0; i < cantEpisodios; i++) {
            Episodio e = new Episodio(null, null);
            episodios.add(e);
        }
    }

    public void newEpisodio(Episodio e) {
        episodios.add(e);
    }

    public void setCalificacion(float calificacion) {

    }

    public int episodiosVistos() {
        int x = 0;
        for (Episodio p : episodios) {
            if (p.loVio()) {
                x++;
            }
        }
        return x;
    }

    public float getPromedio() {
        float x = 0;
        int y = 0;
        for (Episodio e : episodios) {
            if (e.loVio()) {
                y++;
                x += e.getCalificacion();
            }
        }
        return x / y;
    }

    public int cantEpisodios() {
        return episodios.size();
    }
}
