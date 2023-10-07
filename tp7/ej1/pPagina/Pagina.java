package pPagina;

import java.util.ArrayList;

import Elementos.Elemento;
import Estilos.Estilo;

public class Pagina {
    private ArrayList<Elemento> elementos = new ArrayList<>();

    public Pagina() {

    }

    public Pagina(ArrayList<Elemento> elementos) {
        this.elementos = elementos;
    }

    public Pagina copiaPagina(Pagina pag, Estilo estilo) {
        Pagina p = pag;
        estilo.tranformaPag(p);
        return p;
    }

    public void addElemento(Elemento e) {
        elementos.add(e); // agrega elemento al final de la pagina
    }

    public void addElemento(int pos, Elemento e) {
        elementos.add(pos, e); // agrega elemento al final de la pagina
    }

    public ArrayList<Elemento> getElementos() {
        return elementos;
    }

    public int getTamanio() {
        int x = 0;
        for (Elemento elemento : elementos) {
            x += elemento.getTamanio();
        }
        return x;
    }

    public void cambiaTamanio(int porcentaje) { // % positivo = aumenta tamanio, % negativo = reduce tamanio
        for (Elemento elemento : elementos) {
            elemento.cambiaTamanio(porcentaje);
        }
    }
}
