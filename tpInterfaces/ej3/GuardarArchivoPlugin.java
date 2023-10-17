package ej3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GuardarArchivoPlugin extends GuardaTexto implements Plugin {
    private String path;

    public GuardarArchivoPlugin(String texto, String path) {
        super(texto);
        this.path = path;
    }

    @Override
    public void ejecutar() {
        try {
            Files.write(Paths.get(path), getTexto().getBytes());
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
