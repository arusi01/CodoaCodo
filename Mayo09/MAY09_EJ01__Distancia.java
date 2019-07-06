
package cfp10;

import java.util.Scanner; // libreria

public class MAY09_EJ01__Distancia {

    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);
    
    float Velocidad,Tiempo,Distancia;

    System.out.print("Ingrese la velocidad del vehiculo en m/s: ");
    Velocidad = teclado.nextFloat();
    
    System.out.print("Ingrese la tiempo transcurrido del vehiculo en segundos: ");
    Tiempo= teclado.nextFloat();
    
    Distancia= (float) Velocidad*Tiempo;
    
    System.out.println("La distancia recorrida del vehiculo a "+Velocidad+" m/s en "+Tiempo+" segundos es de: "+Distancia+" metros");

    }
}
