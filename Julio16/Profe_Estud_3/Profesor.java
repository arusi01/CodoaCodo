package JUN16_Profe_Estud_3;

public class Profesor extends Estudiante {

    private int cursos;

    public Profesor(int cursos, int legajo, String nombre, String apellido, int edad, String Nacionalidad) {
        super(legajo, nombre, apellido, edad, Nacionalidad);
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return "Profesor " + "cursos=" + cursos + " "+super.toString();
    }

    
}
