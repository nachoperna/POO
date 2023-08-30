public class Arco {
    private int vertice;
    private int costo;

    public Arco() {

    }

    public Arco(int v, int c) {
        vertice = v;
        costo = c;
    }

    public int getVertice() {
        return vertice;
    }

    public int getCosto() {
        return costo;
    }
}
