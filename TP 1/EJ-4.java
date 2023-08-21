public class Persona{
	private String nombre;
	private int edad;
	
}

public class Vuelo{
	private ArrayList<Persona> pasajeros;
	private int identificador;
	private bool lleno;
	private String salida;
	private String destino;
	private int horaSalida; 
	private int horaLlegada;
	
}

public class Aerolinea{
	private ArrayList<Vuelo> vuelos; // lista de vuelos actuales de la aerolinea
	
	public void Aerolinea(){
		this.setVuelos(); // genera todos los vuelos
	}
	public void Reserva(String destino, int fechaTemprana, int fechaTardia){
		
	}
}
