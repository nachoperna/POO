public class Direccion {
    private String persona;
    private String ciudad;
    private String calle;
    private int numero;

    public Direccion(String persona, String ciudad, String calle, int numero) {
        this.persona = persona;
        this.ciudad = ciudad;
        this.calle = calle;
        this.numero = numero;
    }

    public String getPersona() {
        return persona;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

}
