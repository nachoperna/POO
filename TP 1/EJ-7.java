public class Persona{
  private int dni;
  private String nombre;
  
  public void setNombre(String n){this.nombre = n}
  public String getNombre(){return this.nombre;}
  public int getDni(){return this.dni}
}

public class Empleado extends Persona{ // se usa la herencia para compartir ciertos atributos
  private int encuestasRealizadas;
  private int paga;
  
  public Empleado(){

  }

  public void sumaEncuesta(){ this.encuestasRealizadas++; }
  public int getCantEncuestas(){ return this.encuestasRealizadas; }
}

public class Encuesta{
  private int dniEncuestado;
  private int dniEncuestador;
  private ArrayList<int> encuestados;
  private ArrayList<String> preguntas; // lista de preguntas
  
  public void completaEncuesta(int x, int y){
    setEncuestado(x); setEncuestador(y);
    for(int i=0; i<preguntas.size(); i++){
      // se completan las preguntas
    }
    this.encuestados.add(x); // persona con dni x que ya no puede hacer la misma encuesta
  }
  
  public void setEncuestado(int d){ this.dniEncuestado = d; }
  public void setEncuestador(int d){ this.dniEncuestador = d; }
  
  public bool encuestado(int dni){
    int i = 0;
    while ((i < encuestados.size()) && (encuestados(i) != dni)) { i++; }
    if (encuestados(i) == dni) { return true; }
    return false;
  }
}

public class Consultora{
  private ArrayList<Empleado> empleados;
  private ArrayList<Encuesta> encuestas;
  
  public void Encuestar(Persona p){ // persona que contacta la consultora para realizar una encuesta
    int i = 0;
    while (encuestas(i).encuestado(p.getDni())){ // si la persona p ya realizo la encuesta seleccionada aleatoriamente se busca otra
      i = Math.random()*(encuestas.size()) + 1; // toma un indice de encuesta al azar
    }
    Encuesta enc = encuestas(i);
    int x = Math.random()*(empleados.size() + 1; // toma un indice de empleados al azar
    Empleado emp = empleados(x);
    enc.completaEncuesta(p.getDni(), emp.getDni()); // completa la encuesta con el dni del encuestado y el empleado
    emp.sumaEncuesta();
  }

  public void otorgaPlus(){
    for(int i=0; i<empleados.size(); i++){
      //otorga plus a todos los empledados segun encuestas realizadas
    }
  }
}
