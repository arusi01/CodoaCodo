package JUN16_Estudiantes;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante pepe = new Estudiante("pepe",34, 23456789);
        
        pepe.setNombre("daniel");
        
        System.out.println(pepe.toString());
        
        System.out.println("Estudiante Nombre: "+pepe.getNombre()
                           + " edad: " +pepe.getEdad()
                           + " dni: "+pepe.getDni());
    }
}
