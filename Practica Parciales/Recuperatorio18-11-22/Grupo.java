public class Grupo extends Seccion {
    public String getCategoria() {
        int i = (int) Math.random() + getNoticias().size();
        return getNoticias().get(i).getCategoria();
    }
}
