package ej3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Form1 extends Formulario {
    private Map<String, ArrayList<String>> preguntas = new HashMap<>();

    public Form1() {

    }

    @Override
    public void nuevaPregunta(String pregunta, Object respuesta) {
        ArrayList<String> respuestas = (ArrayList<String>) respuesta;
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nuevaPregunta'");
    }

}
