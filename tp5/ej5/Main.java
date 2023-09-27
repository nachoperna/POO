package ej5;

public class Main {
    public static void main(String[] args) {
        Tablero tablero = new Tablero();
        tablero.setPuntaje_minimo(0);

        Ficha f1 = new Ficha("chocolatea", 1, 1, 0);
        Ficha f2 = new Ficha("piedra", 6, 1, 0);
        Ficha f3 = new Ficha("caramelo a rayas", 1, 1, 10);
        Ficha f4 = new Ficha("torta", 4, 8, 4);

        tablero.addFichas(f1);
        tablero.addFichas(f2);
        tablero.addFichas(f3);
        tablero.addFichas(f4);

        System.out.println("Todas las fichas que posean un valor de destruccion mayor a 2: ");
        System.out.println(tablero.busqueda(new CompDestruccion(2)));
        System.out.println("\n\nTodas las fichas que ocupan mas de 4 lugares");
        System.out.println(tablero.busqueda(new CompEspacio(4)));
        System.out.println("\n\nTodas las fichas que tengan fortaleza mayor a 5");
        System.out.println(tablero.busqueda(new CompFortaleza(5)));
    }
}
