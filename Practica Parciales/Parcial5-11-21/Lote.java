import java.util.ArrayList;

public class Lote extends Cartera {
    private ArrayList<Cartera> elementos = new ArrayList<>();
    private String nombre;
    private Filtro agrega;

    public Lote(String nombre, Filtro agrega) {
        this.nombre = nombre;
        this.agrega = agrega;
    }

    public void addElemento(Cartera x) {
        if (agrega.cumple(x)) {
            elementos.add(x);
        }
    }

    public void cambiaFiltro(Filtro f) {
        agrega = f;
    }

    @Override
    public float getPrecio() {
        float x = 0;
        for (Cartera c : elementos) {
            x += c.getPrecio();
        }
        return x;
    }

    @Override
    public int getAnio() {
        float x = 0;
        float y = elementos.size();
        for (Cartera c : elementos) {
            x += c.getAnio();
        }
        return ((int) (x / y));
    }

    @Override
    public String getMarca() {
        return elementos.get((int) (Math.random() + elementos.size())).getMarca();
    }

    @Override
    public int contar() {
        int x = 0;
        for (Cartera c : elementos) {
            x += c.contar();
        }
        return x;
    }

    @Override
    public Lote copia(Filtro f) {
        if (f.cumple(this)) {
            Lote copia = new Lote(nombre, new FiltroAND(agrega, f)); // si cumple con el criterio entonces la copia
                                                                     // combina la restriccion original con el criterio
                                                                     // filtrado
            for (Cartera c : elementos) {
                copia.addElemento(c);
            }
            return copia;
        }
        return null;
    }

}
