package AGO08_ArrayObjeto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Scanner tam = new Scanner(System.in);

        System.out.print("Ingrese cantidad de personas: ");
        int tamanio = tam.nextInt();

        Persona persona[] = new Persona[tamanio];
//         persona[0].setNombre("daniel");
//         persona[0].setApellido("Perez");

        for (int i = 0; i < persona.length; i++) {
            persona[i] = new Persona();
            System.out.print("Ingrese su nombre: ");
            String nombre = teclado.next();
            System.out.print("Ingrese su apellido: ");
            String apellido = teclado.next();
            System.out.print("Ingrese su edad: ");
            int edad = teclado.nextInt();

            persona[i].setNombre(nombre);
            persona[i].setApellido(apellido);
            persona[i].setEdad(edad);
        }
        
        for(Persona Per : persona) {
            System.out.println("El nombre: "+Per.getNombre());
            System.out.println("El apellido: "+Per.getApellido());
            System.out.println("La edad: "+Per.getEdad());
        }
    }    
}

