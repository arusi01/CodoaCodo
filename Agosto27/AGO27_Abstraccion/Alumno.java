package AGO27_Abstraccion;

public class Alumno extends Persona{
    
    private int legajo;

    public Alumno(int legajo, String nombre, int edad) {
        super(nombre, edad);
        this.legajo = legajo;
    }
    
    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
}
