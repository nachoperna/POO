public class Persona{
	private String nombre;
	private int edad;
}

public class Vuelo{
	private ArrayList<Persona> pasajeros;
	public int identificador;
	public bool lleno;
	public String salida;
	public String destino;
	public int fechaSalida;
	public int fechaLlegada;

	public void newPasajero(Persona p){
		this.pasajeros.add(p);
	}
	public ArrayList<Persona> getPasajeros(){ return pasajeros; }
}

public class Aerolinea{
	private ArrayList<Vuelo> vuelos; // lista de vuelos actuales de la aerolinea
	
	public void Aerolinea(){
		this.setVuelos(); // genera todos los vuelos
	}
	
	public void Reserva(Persona cliente, String destino, int fechaTemprana, int fechaTardia){ // tambien agregar las preferncias de asiento y confort
		private ArrayList<Vuelo> vuelosDisponibles;
		for (int i=0;i < vuelos.size(); i++){
			if ((vuelos(i).destino == destino) && (!vuelos(i).lleno())){ // el vuelo coincide con el destino y hay lugar
				if ((vuelos(i).fechaSalida >= fechaTemprana) && (vuelos(i).diaSalida <= fechaTardia)){ // la fecha de salida del vuelo esta dentro del rango del cliente
					vuelosDisponibles.add(vuelos(i));
				}
			}
		}
		this.Confirmacion(vuelosDisponibles, cliente);
	}

	public void Confirmacion(ArrayList<Vuelo> vuelosDisponibles, Persona cliente){
		private int opcion; 
		for (int i=0; i < vuelosDisponibles.size(); i++){
			System.out.println(vuelosDisponibles(i));
		}
		// el cliente elije el vuelo que desea 
		if (opcion != 0){
			vuelosDisponibles(opcion).newPasajero(cliente);
		}
		else{
			System.out.println("Vuelva pronto!");
		}
	}
}
