import java.util.ArrayList;

public class Pagina {
    private ArrayList<Elemento> elementos = new ArrayList<>();

    public Pagina() {

    }

    public void copiaPagina(Estilo estilo) {
        estilo.tranformaPag(this);
    }

    public void addElemento(Elemento e) {
        elementos.add(e);
    }

    public ArrayList<Elemento> getElementos() {
        return elementos;
    }

    public int getTamanio() {
        int x = 0;
        for (Elemento elemento : elementos) {
            x += elemento.getTamanio();
        }
        return x;
    }
}
