public class Persona{
    private String nombre;
    private int reservas = 0;
	private int fechaPrimerturno; // en meses
    public String getNombre(){return this.nombre;}
	public int getReservas(){return this.reservas;}
	public void newReserva(){reservas++;}
}

public class Turnos{
    private int fecha;
    private String cancha;
	private String usuario;
	
	public Turno(String u, int f, String c){
		this.usuario = u;
		this.fecha = f;
		this.cancha = c;
	}
}

public class Establecimiento{
    private ArrayList<Persona> socios;
    private ArrayList<Persona> clientes;
    private ArrayList<Turnos> turnos;
    private int precioFutbol = 400;
    private int precioPaddle = 100;
    private int recaudacion;
    private int ocupacionFutbol; private int ocupacionPaddle;

    public void Turno(Persona cliente, int fechaTurno, String cancha){
		private bool hayLugar = false;
        if (cancha == "Futbol"){
            if (ocupacionFutbol < 2){ // tambien debe buscar por fecha
				hayLugar = true;
                this.Recauda(cliente, cancha, precioFutbol, 5);
				cliente.newReserva();
				ocupacionFutbol++;
            }
        }
        else{
            if (ocupacionPaddle < 4){
				hayLugar = true;
				this.Recauda(cliente, cancha, precioFutbol, 4);
				cliente.newReserva();
				ocupacionPaddle++;
            }
        }
		if (hayLugar){
			Turnos t = new Turnos(cliente.getNombre(),fecha,cancha);
			this.turnos.add(t);
		}
		else{
			System.out.println("Lo siento, no hay lugares para turnos disponibles");
		}
    }

    public bool esSocio(String n){
		for (int i=0; i < socios.size(); i++){
			if (socios(i).getNombre() == n) {return true;}
		}
		return false;
    }

	public void Recauda(Persona cliente, String cancha, int precio, int jugadores){
		if (this.esSocio(cliente.getNombre())){
            this.recaudacion = (precio%90) + (precio * jugadores);  
        }
		else{
			this.recaudacion = precio * jugadores;
			if (cliente.getReservas() + 1 >= 4){ socios.add(cliente); }
		}
	}

	// podria haber una funcion de revision de socios donde se eliminen si llevan mas de 2 meses sin 4 turnos
}
