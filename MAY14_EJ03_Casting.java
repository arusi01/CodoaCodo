
package cfp10;

import java.util.Scanner; // libreria

public class MAY14_EJ03_Casting {
    
    public static void main(String[] args) {
            
        Scanner teclado = new Scanner(System.in);

        int Edad; //he declarado la variable de tipo entero
        String Nombre,Dni;
    
        System.out.println("Seleccion de casting");
        System.out.print("Ingrese su nombre: ");
        Nombre = teclado.nextLine();
        System.out.print("Ingrese su dni: ");
        Dni = teclado.nextLine();
        System.out.print("Ingrese su edad: ");
        Edad = teclado.nextInt();
    
        System.out.println("");
        if (Nombre.equalsIgnoreCase("pepe") && (Edad>18 || Edad==18)) {
            System.out.println(Nombre+" con dni: "+Dni+" SI fue seleccionado para el casting");        
        }else{
            System.out.println(Nombre+" con dni: "+Dni+" NO fue seleccionado para el casting");
        }
    }
}
