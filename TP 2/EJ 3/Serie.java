import java.util.ArrayList;

public class Serie<Temporada> {
    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;
    private ArrayList<Temporada> temporadas = new ArrayList<>();

    public Serie(String t, String d, String c, String g) {
        titulo = t;
        descripcion = d;
        creador = c;
        genero = g;
    }

    public void newTemporada(Temporada t) {
        temporadas.add(t);
    }

    public String getCreador() {
        return creador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getGenero() {
        return genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public int episodiosVistos() {
        int x = 0;
        for (Temporada t : temporadas) {
            x += t.episodiosVistos();
        }
        return x;
    }

    public int episodiosVistos(int temp) {
        Temporada t = temporadas.get(temp);
        return t.episodiosVistos();
    }

    public float getPromedio(int temp) {
        Temporada t = temporadas.get(temp);
        return t.getPromedio();
    }

    public float getPromedio() {
        float x = 0;
        for (int i = 0; i < temporadas.size(); i++) {
            x += getPromedio(i);
        }
        return x;
    }

    public Boolean serieCompleta() {
        int x = 0;
        int episodiosTotales = 0;
        for (int i = 0; i < temporadas.size(); i++) {
            x += episodiosVistos(i);
            Temporada t = temporadas.get(i);
            episodiosTotales += t.cantEpisodios();
        }
        return (x == episodiosTotales);
    }

    public static void main(String[] args) {

    }
}