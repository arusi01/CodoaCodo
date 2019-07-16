package JUN16_Profe_Estud;

public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    private String Nacionalidad;

    public Persona(String nombre, String apellido, int edad, String Nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.Nacionalidad = Nacionalidad;
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", Nacionalidad=" + Nacionalidad;
    }
    
}
