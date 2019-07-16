package JUN16_Profe_Estud_2;

public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    private String Nacionalidad;

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", Nacionalidad=" + Nacionalidad;
    }
    
}
