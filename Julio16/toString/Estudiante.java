package JUN16_Estudiantes;

public class Estudiante {

    //Atributos
    private String nombre;
    private int edad;
    private int dni;
    
    //Constructor
    public Estudiante(String nombre, int edad,int dni){
        this.nombre=nombre;
        this.edad=edad;
        this.dni=dni;
    }

    //Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }
    
    public void setDni(int dni) {
        this.dni = dni;
    }
    
    @Override
    public String toString(){
        return "Estudiante Nombre: "+nombre+" Edad: "+edad+" dni: "+dni;
    }
}
