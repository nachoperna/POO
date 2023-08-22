public class Persona{
	private String nombre;
}

public class Turno{
	private int fecha;
	private int horario;
	private Persona cliente;
}

public class Peluquero{
	private String nombre;
	private ArrayList<Persona> clientes;
	private ArrayList<Turno> turnos;

	public Peluquero(String n){this.nombre = n}
}

public class Peluqueria{
	private ArrayList<Peluquero> peluqueros;

	public void setPeluqueros(){
		for (int i=1; i <= 4; i++){
			
		}
	}
	
}
