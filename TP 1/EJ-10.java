public class Contacto{
  private String nombre;
  private String nacimiento;
  private int telefono;
  private String direccion;
  private String ciudad;
  private String mail;
  private int edad;
  private String ciudad;

  public Contacto(...){
    // setea todos los datos
  }
  public String getNombre(){return this.nombre;}
  public int getTelefono(){return this.telefono;}
  public String getCiudad(){return this.ciudad;}
  public int getEdad(){return this.edad;}

  public String toString(){
    System.out.println(getNombre());
    System.out.println(getTelefono());
    System.out.println(getCiudad());
    System.out.println(getEdad());
  }
}

public class Celular{
  private ArrayList<Contacto> contactos;
  private ArrayList<Contacto> repetidos;
  private float promedioEdad;

  public void infoContactos(){
    for (int i=0; i<contactos.size(); i++){
      System.out.println(contactos(i));
      if (esRepetido(contactos(i)){ repetidos.add(contactos(i))};
      this.promedioEdad += contactos(i).getEdad();
    }
    System.out.println(promedioEdad);
    System.out.println(repetidos);
  }
  public bool esRepetido(Contacto c){
    bool r = false;
    for(int i=0; i<contactos.size(); i++){
      if ((contactos(i).getNombre() == c.getNombre()) && (contactos(i).getTelefono() == c.getTelefono())){ r = true; }
    }
    return r;
  }
  public float promedio(){
    return (this.promedioEdad / (contactos.size() - repetidos.size()));
  } 
}
