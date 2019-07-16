package JUN16_Herencia;

//Un alumno es una persona
public class Alumno extends Persona{ // Clase Hija

    private String matricula;

    public Alumno(String matricula,String nombre, int edad) {
        super(nombre, edad);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return super.toString()+"Alumno{" + "matricula=" + matricula + '}';
    }




    
    
}
