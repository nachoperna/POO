import java.util.ArrayList;

public class Agenda {
    private ArrayList<Reunion> reuniones = new ArrayList<>();

    public Agenda() {

    }

    public Boolean conflictoHorarios(Reunion r) {
        for (Reunion reunion : reuniones) {
            if (((r.getInicio() >= reunion.getInicio()) && (r.getInicio() <= reunion.getFin()))
                    || ((r.getFin() >= reunion.getInicio()) && (r.getFin() <= reunion.getFin()))) {
                return true;
            }
        }
        return false;
    }

    public void addReunion(Reunion r) {
        if (!conflictoHorarios(r)) {
            reuniones.add(r);
        } else {
            // LA AGENDA BUSCA UN ESPACIO HORARIO DONDE METER LA REUNION O SOLO LE INFORMA
            // AL USUARIO QUE NO SE PUEDE AGENDAR CON ESE HORARIO
        }
    }

}
