package JUN16_Profe_Estud;

public class Estudiante extends Persona {
    
    private int legajo;

    public Estudiante(int legajo, String nombre, String apellido, int edad, String Nacionalidad) {
        super(nombre, apellido, edad, Nacionalidad);
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return "Estudiante " + "legajo=" + legajo+" "+super.toString();
    }
    
    
}
