package JUN16_Herencia;

public class Main {

    public static void main(String[] args) {
        
        Persona persona = new Persona("alberto",34);
        Alumno pepe = new Alumno("programacion","pepe",32);
        Alumno daniel = new Alumno("fisica","daniel",23);
        
        System.out.println(pepe.toString());
        System.out.println(daniel.toString());
        System.out.println(persona.toString());
    }  
}
