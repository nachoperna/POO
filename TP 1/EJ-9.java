public class Personaje{
  private String nombreReal;
  private String nombrePersonaje;
  private int visionNocturna;
  private int fuerza;
  private int peso;
  private int altura;
  private int edad;

  public Personaje(...){
    // setea todas las caracteristicas
  }  
}

//template <typename T> 
public class Reglas{

  public int Ganador(T heroe, T villano){
    if (heroe > villano){ return 1; }
    else if (villano > heroe){ return 2; }
    else{ return 0; }
  }
}

public class Mazo{
  private ArrayList<Personaje> heroes;
  private ArrayList<Personaje> villanos;

  public Personaje getHeroe(){ // devuelve una carta heroe del mazo
    int i = Math.random()*(heroes.size());
    Persona h = heroes(i);
    delete heroes(i);
    return h;
  }
  public Personaje getVillano(){ // devuelve una carta villano del mazo
    int i = Math.random()*(villanos.size()); 
    Personaje v = villanos(i);
    delete villanos(i);
    return v;
  }
  public bool esVacio(){
    if ((heroes == null) && (villanos == null)) { return true; }
    return false;
  }
}

public class Juego{
  private Mazo mazo;
  private Reglas reglas;
  // implementar jugadores y puntaje
  public void Play(){
    while (!mazo.esVacio()){ // mientras que queden cartas por jugar
      int ganador = reglas.Ganador(mazo.getHeroe(), mazo.getVillano());
      if (ganador == 1) {
        // suma puntos a jugador A
      }
      else if (ganador == 2){
        // suna puntos a jugador B
      }
      else{
        // suma puntos a ambos por EMPATE
      }
    }
  }
}
