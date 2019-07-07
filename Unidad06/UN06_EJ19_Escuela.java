package cfp10;

import java.util.Scanner;

public class UN06_EJ19_Escuela {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Aulas de la Escuela");
        System.out.println("");

        String aulas[][] = {{"Azul", "Verde", "Amarillo"}, {"40", "35", "30"}};

        int alumnos;
        do {
            System.out.print("Ingrese cantidad de alumnos de tercer grado inscriptos (40 maximo): ");
            alumnos = sc.nextInt();
        } while (alumnos > 40 | alumnos < 0);

        int ocupacion=40;
        String aulaelejida="";
        
        for (int i=0;i<aulas[0].length;i++){
            int asientos=(Integer.parseInt(aulas[1][i].trim())-alumnos);
            if (asientos<ocupacion && asientos>=0){
                aulaelejida=aulas[0][i];
            }
        }

        System.out.println("\nEl aula elegida para el tercer grado es: "+aulaelejida);
    }
}
