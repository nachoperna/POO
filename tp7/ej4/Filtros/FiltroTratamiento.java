package ej4.Filtros;

import ej4.Drogas.Enfermedad;
import ej4.Drogas.Medicamento;

public class FiltroTratamiento extends FiltroEnfermedad implements Filtro {

    public FiltroTratamiento(Enfermedad e) { // SERVICIO A y SERVICIO C
        super(e);
    }

    @Override
    public boolean aplica(Medicamento medicamento) {
        return medicamento.trataEnfermedad(getEnfermedad());
    }

}
