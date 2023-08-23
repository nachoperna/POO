public class Persona{
	private String nombre;
	public String getNombre(){return this.nombre;}
}

public class Turno{
	private bool ocupado = false;
	private int fecha;
	private int horario; // falta implementear horarios seteados en un sistema de 8hs de trabajo (mas o menos 16 turnos disponibles por dia) 
	private Persona cliente;
	public Turno(int f, int h, Persona p){
		this.fecha = f;
		this.horario = h;
		this.cliente = p;
	}
	public int Ocupado(){
		return this.ocupado;	
	};
}

public class Peluquero{
	private String nombre;
	private ArrayList<Persona> clientes;
	private ArrayList<Turno> turnos;

	public Peluquero(String n){this.nombre = n}
	public void setTurno(Persona p){
		int i = 0;
		while ((this.turnos(i).Ocupado()) && (i < this.turnos.size())){ i++; }
		if (!this.turnos(i).Ocupado()){
			Turno t = new Turno(f,h,p);
			turnos.add(t);
		}
	}

	public Turno turnoDisponibles(){
		int i = 0;
		while ((this.turnos(i) != null) && (this.turnos(i).Ocupado())) { i++; }
		if (!this.turnos(i).Ocupado()) { return this.turnos(i); }
	}

	public String getNombre(){ return this.nombre; }
}

public class Peluqueria{
	private ArrayList<Peluquero> peluqueros;
	private int precio;
	private int caja;
	private ArrayList<Persona> clientesFrecuentes; // falta agregar sistema de fechas de ultimos turnos para eliminar y agregar nuevos clientes frecuentes
	
	public void setPeluqueros(){
		Peluquero p1 = new Peluquero("p1"); peluqueros.add(p1);
		Peluquero p2 = new Peluquero("p2"); peluqueros.add(p2);
		Peluquero p3 = new Peluquero("p3"); peluqueros.add(p3);
		Peluquero p4 = new Peluquero("p4"); peluqueros.add(p4);
	}

	public void setTurno(Persona cliente, String p){
		for (int i = 0; peluqueros(i).getNombre() != p; i++){} // busca el peluquero que pidio el cliente
		peluqueros(i).setTurno(cliente);
		if (this.esFrecuente(cliente)){
			this.caja += caja%90;
		}
		else{ this.caja += precio; }
	}

	public bool esFrecuente(Persona cliente){
		int i = 0;
		while ((this.clientesFrecuentes(i) != null) && (this.clientesFrecuentes(i).getNombre() != cliente.getNombre())){ i++; }
		if (this.clientesFrecuentes(i) != null) { return true; }
		return false;
	}

	public void turnosDisponibles(){
 
	}
}
