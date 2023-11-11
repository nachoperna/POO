public class Main {
    public static void main(String[] args) {
        Combo combo = new Combo(null, 0);
        combo.listar(new FiltroDestino("Tandil"));
        combo.listar(new FiltroAND(new FiltroDestino("Tandil"), new FiltroCalle("9 de Julio")));
        combo.listar(new FiltroAND(new FiltroDestino("Olavarria"), new FiltroDirRemitente("Azul")));
        combo.listar(new FiltroRemitente("Ned Flanders"));

    }
}
