package ej4;

public class Gryffindor extends Casa {
    public Gryffindor(int capacidad) {
        super(capacidad);
    }

    public Boolean poseeCualidades(Alumno alumno) {
        Boolean x = super.poseeCualidades(alumno);
        for (Alumno familiar : alumno.getFamiliares()) {
            if (x && super.getAlumnos().contains(familiar)) {
                return true;
            }
        }
        return false;
    }
}
