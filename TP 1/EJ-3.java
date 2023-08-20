public class Facebook{
	private Persona usuario = new Persona("carlos") ;
	private ArrayList<Publicacion> publicaciones;
	private ArrayList<Evento> eventos;
}

public class Persona{
	private String nombre;
	private ArrayList<Persona> amigos; //lista de amigos
	public void Persona(String name){this.nombre = name;}
	public void addAmigo(){}
}

public class Publicacion{
	private Persona usuario;
	private String contenido;
	private int cantCaracteres;
	public void Publicacion(){}
}

public class Evento{
	private int cantParticipantes;
	private ArrayList<Persona> participantes;
	private int horario;
	private String lugar;
	private String motivo;
	public void Evento(){}
}
