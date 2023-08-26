public class Persona {
    private String nombre;
    private String nacimiento;
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

    public Persona(int dni, String nombre, String nacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.edad = 22; // this.edad = funcion piso(local date - fecha de nacimiento)
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
        return false;
        // establecer local date y variable date para fecha nacimiento
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
        print += " /Nombre: " + nombre;
        print += " /Edad: " + edad;
        print += " /Dni: " + dni;
        print += " /Nacimiento: " + nacimiento;
        print += " /Sexo: " + sexo;
        print += " /Peso: " + peso;
        print += " /Altura: " + altura;
        return print;
    }

    public static void main(String[] args) {
        Persona p = new Persona(42883287, "N N ", null);
        p.setSexo('F');
        p.setAltura(1);
        p.setPeso(1);
        System.out.println(p);
    }
}
