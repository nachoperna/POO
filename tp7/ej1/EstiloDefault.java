public class EstiloDefault extends Estilo {
    public EstiloDefault() {
        Transformacion t1 = new Transformacion1();
        Transformacion t3 = new Transformacion3();
        Transformacion t6 = new Transformacion6();

        super.addTransformacion(t1);
        super.addTransformacion(t3);
        super.addTransformacion(t6);
    }
}
