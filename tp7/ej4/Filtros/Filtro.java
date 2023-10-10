package ej4.Filtros;

import ej4.Drogas.Medicamento;

public interface Filtro {
    public abstract boolean aplica(Medicamento medicamento);
}
