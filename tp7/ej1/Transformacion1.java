public class Transformacion1 extends Transformacion {

    @Override
    public void aplica(Pagina p) {
        int posicion = 0;
        for (Elemento e : p.getElementos()) {
            if (e.getPosicion() > posicion) {
                posicion = e.getPosicion(); // obtiene el elemento situado en la ultima posicion de la pagina
            }
        }

        Elemento elem = new Parrafo("" + p.getTamanio(), posicion);
        p.addElemento(elem);
    }

}
