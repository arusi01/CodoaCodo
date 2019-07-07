package JUN04_Persona;

public class Persona {

    private String nombre;
    private int edad;
    private char sexo;
    private int dni;
    
    public String getNombre(){  /// alt+ins
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public int getDni() {
        return dni;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void mostrar() {
        System.out.println("Mi nombre es: " + nombre + " y mi edad es: " + edad
                + " y tengo sexo: " + sexo + " con dni: " + dni);
    }

}
