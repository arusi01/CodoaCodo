
package cfp10;

import java.util.Scanner;

public class MAY28_Vectores {
    
   public static void main(String[] args) {

// ************ Array Entero   Ejercicio 1  
                   // [0},[1]         [7]
       int vector[]={1,2,3,4,5,6,7,8};
       
       System.out.println("Vector posicion 1: " + vector[0]);
       System.out.println("Vector Largo: " + vector.length);
       
// ************ Array Entero   Ejercicio 2
       int vector2[]= new int[8];

       vector2[0]=1;
       vector2[1]=2;
       vector2[2]=3;
       vector2[3]=4;
       vector2[4]=5;
       vector2[5]=6;
       vector2[6]=7;
       vector2[7]=8;

       System.out.println("Vector2 posicion 8: " + vector2[7]);
       
// ************ Array String   Ejercicio 3
       String vector3[]={"Pepe","Carlos","Beto","Pablo","Marcos","Jose","Juan","Daniel"};

       System.out.println("Vector3 posicion 4: " + vector3[3]);

// ************ Array String   Ejercicio 4 
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Ingrese su nombre: ");
       String Nombre = sc.next();
       
       System.out.print("Ingrese su apellido: ");
       String Apellido = sc.next();
       
       String vector4[] = {Nombre,Apellido};
       
       System.out.println("Nombre: " + vector4[0]+" " + vector4[1]);
       
// ************ Array char   Ejercicio 5
       char vector5[]={'a','b','c'};

       System.out.println("caracter vector5 Posicion 2: " + vector5[1]);

// ************ Array char   Ejercicio 6    
       char vector6[]= new char[3];
       
       vector6[0]='a';
       vector6[1]='b';     
       vector6[2]='c';
       
       System.out.println("caracter vector6 Posicion 1: " + vector6[0]);
       System.out.println("Vector6 Largo: " + vector6.length);
 
// ************ Array string   Ejercicio 7

       String vector7[]={"Pepe","Carlos","Beto","Pablo","Marcos","Jose","Juan","Daniel"};

       for (int posicion = 0; posicion < vector7.length; posicion++) {
          System.out.println("vector7 posicion "+posicion+" - Nombre: " + vector7[posicion]);         
       }       
   }
}
