package ej4.Drogas;

import java.util.ArrayList;

public class Enfermedad extends Componente {

    public Enfermedad(String nombre, ArrayList<String> estados_patologicos) {
        super(nombre);
        setAcciones_terapeuticas(estados_patologicos); // utiliza la misma herencia al compartir tipos
    }

}
