public class FiltroDirRemitente implements Filtro {
    private String ciudad;

    public FiltroDirRemitente(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public boolean cumple(Elemento e) {
        return ((Envio) (e)).getDireccion_remitente().getCiudad().equals(ciudad);
    }

}
