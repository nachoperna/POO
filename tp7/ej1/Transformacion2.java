public class Transformacion2 extends Transformacion {

    @Override
    public void aplica(Pagina p) {

        Elemento e = new Parrafo("" + p.getElementos().size(), 0); // solo con add deberia añadirlo al final de la
                                                                   // pagina
        p.addElemento(e);
    }

}
