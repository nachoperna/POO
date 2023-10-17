package ej3;

public class Main {
    public static void main(String[] args) {
        String txt = "Esto es una prueba del ejercicio 3 de Programacion Orientada a Objetos";

        ProcesadorTxt procesador = new ProcesadorTxt();
        procesador.ejecutarPlugin(new GuardarArchivoPlugin(txt, "C:\\Users\\ignac\\Downloads\\archivoPOO.txt"));

        ContadorPalabrasPlugin p1 = new ContadorPalabrasPlugin(txt);
        procesador.ejecutarPlugin(p1);
        System.out.println("Cantidad de palabras del texto: " + p1.getCantPalabras());

        ContadorOcurrenciasPlugin p2 = new ContadorOcurrenciasPlugin(txt, "Orientada");
        procesador.ejecutarPlugin(p2);
        System.out.println("Cantidad de ocurrencias de " + p2.getPalabra() + ": " + p2.getCantOcurrencias());

        ReemplazoTextoPlugin p3 = new ReemplazoTextoPlugin(txt, "Objetos", "Penes");
        procesador.ejecutarPlugin(p3);
        System.out.println("Nuevo texto con palabra reemplaza: " + p3.getTexto());

        EliminarPalabraPlugin p4 = new EliminarPalabraPlugin(txt, "una");
        procesador.ejecutarPlugin(p4);
        System.out.println("Palabra eliminada: " + p4.getPalabraEliminada() + ". Texto: " + p4.getTexto());
    }
}
