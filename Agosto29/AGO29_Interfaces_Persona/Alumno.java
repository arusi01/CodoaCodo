package AGO29_Interfaces_Persona;

import java.util.Scanner;

public class Alumno implements Persona,OrientacionPolitica{
//public class Alumno extends Profesor implements Persona {

    String nombre="";
    
    public void ingresar() {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        nombre = sc.next();
    }

    public void mostrar() {
        System.out.println("Nombre: "+nombre);
    }

    public void capitalista() {
    }

    public void comunista() {
    }
    
}
