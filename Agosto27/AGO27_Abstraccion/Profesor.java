package AGO27_Abstraccion;

public class Profesor extends Persona {
    
    private String Materia;

    public Profesor(String Materia, String nombre, int edad) {
        super(nombre, edad);
        this.Materia = Materia;
    }

    public String getMateria() {
        return Materia;
    }

    public void setMateria(String Materia) {
        this.Materia = Materia;
    }
    
    
}
