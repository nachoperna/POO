public class Main {
    public static void main(String[] args) {
        Modelo sistema = new Categoria(null, 0);

        Modelo copia1 = sistema.getCopia(new FiltroAutor("Juan Salomon"));
        Modelo copia2 = sistema.getCopia(new FiltroPal("Maradona"));
        Modelo copia3 = sistema
                .getCopia(new FiltroAND(new FiltroAutor("Pedro Gonzalez"), new FiltroComentario("Estrella 1234")));

        sistema.getCantidad(new FiltroAutor("Juan Salomon"));
        sistema.getCantidad(new FiltroPal("Messi"));
        sistema.getCantidad(new FiltroTema("Animales Salvajes"));
    }
}
