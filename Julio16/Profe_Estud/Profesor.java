package JUN16_Profe_Estud;

public class Profesor extends Persona {

    private int cursos;

    public Profesor(int cursos, String nombre, String apellido, int edad, String Nacionalidad) {
        super(nombre, apellido, edad, Nacionalidad);
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return "Profesor " + "cursos=" + cursos + " "+super.toString();
    }

    
}
