import java.util.ArrayList;

public class Serie {
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

    public void newTemporada(int cantEpisodios) {
        Temporada t = new Temporada(cantEpisodios);
        temporadas.add(t);
    }

    public void temporadasTotales(int x) { // añade directamente la cantidad de temporadas desde el main
        for (int i = 0; i < x; i++) {
            Temporada t = new Temporada((int) Math.random()); // cantidad de episodios random
            temporadas.add(t);
        }
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
        // EJEMPLO DE SERIE: SUITS
        Serie serie = new Serie("Suits", "Abogados", "James Whitmore", "Drama Legal");
        // serie.temporadasTotales(9);
        serie.newTemporada(12); // TEMPORADA 1
        serie.newTemporada(16); // TEMPORADA 2
        serie.newTemporada(16); // TEMPORADA 3
        serie.newTemporada(16); // TEMPORADA 4
        serie.newTemporada(16); // TEMPORADA 5
        serie.newTemporada(16); // TEMPORADA 6
        serie.newTemporada(16); // TEMPORADA 7
        serie.newTemporada(16); // TEMPORADA 8
        serie.newTemporada(10); // TEMPORADA 9
    }
}