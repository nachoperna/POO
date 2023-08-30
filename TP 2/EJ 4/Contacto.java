
public class Contacto {
    private String nombre;
    private String nacimiento;
    private int telefono;
    private String direccion;
    private String ciudad;
    private String mail;
    private int edad;

    public Contacto(String nombre, String nacimiento, int telefono, String direccion, String ciudad, String mail,
            int edad) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.mail = mail;
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getMail() {
        return mail;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public String toString() {
        return "[Nombre: " + nombre + "] | [Telefono: " + telefono + "] | [Mail: " + mail + "]";
    }

}
