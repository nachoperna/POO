import java.time.LocalDate;

public class Persona {
    private String nombre;
    private LocalDate nacimiento;
    private char sexo;
    private int dni;
    private int edad;
    private float peso;
    private float altura;

    public Persona(int dni) {
        this.dni = dni;
    }

    public Persona(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public Persona(int dni, String nombre, LocalDate nacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }

    public void setEdad() {
        LocalDate hoy = LocalDate.now();
        edad = hoy.getYear() - nacimiento.getYear();
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setSexo(char s) {
        sexo = s;
    }

    public void setAltura(float a) {
        altura = a;
    }

    public float masaCorporal() {
        return peso / altura;
    }

    public Boolean enForma() {
        return (masaCorporal() >= 18.5 && masaCorporal() <= 25);
    }

    public Boolean cumpleaños() {
        LocalDate hoy = LocalDate.now();
        return nacimiento.getDayOfYear() == hoy.getDayOfYear();
    }

    public Boolean esMayor() {
        return edad >= 18;
    }

    public Boolean vota() {
        return edad >= 16;
    }

    public Boolean coherente() {
        return false;
    } // return (nacimiento + edad == año actual)}

    public String toString() {
        String print = "";
        print += " [Nombre: " + nombre + "]";
        print += " [Edad: " + edad + "años ]";
        print += " [Dni: " + dni + "]";
        print += " [Nacimiento: " + nacimiento.toString() + "]";
        print += " [Sexo: " + sexo + "]";
        print += " [Peso: " + peso + "]";
        print += " [Altura: " + altura + "]";
        print += " [Cumple aÑos?: " + cumpleaños() + "]";
        return print;
    }

    public static void main(String[] args) {
        Persona p = new Persona(42883287, "N N ", LocalDate.of(2000, 1, 1));
        p.setEdad();
        p.setSexo('F');
        p.setAltura(1);
        p.setPeso(1);
        System.out.println(p);
    }
}
