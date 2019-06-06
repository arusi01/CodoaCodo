package cfp10;

import java.util.Scanner;

public class JUN06_Genero {
    
        public static String sexo(char genero) {
           if (genero=='f' || genero=='F') {
               return ("Femenino");
           }
           if (genero=='m' || genero=='M') {
               return ("Masculino");
           }else{
               return ("Indefinido");
           }
        }
    
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese genero de la persona: ");
        char genero = sc.next().charAt(0);
        
        System.out.println("ES "+sexo(genero));
        
        
    }
}
