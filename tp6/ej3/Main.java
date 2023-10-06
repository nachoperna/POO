package ej3;

public class Main {
    public static void main(String[] args) {
        Compañia comp = new Compañia();
        comp.nuevoEnvio(
                new Envio(new Direccion("tandil", "ituzaingo", 671), new Direccion("necochea", "66", 2426), true, 20));

    }
}
