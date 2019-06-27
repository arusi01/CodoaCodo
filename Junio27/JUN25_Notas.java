package cfp10;

import java.util.Scanner;

public class JUN25_Notas {

    public static void mostrarDatos(int legajo[], String sexo[], float nota[][]) {

        System.out.print("\n+--------+-----------+");
        for (int j = 0; j < nota[0].length; j++) {
            System.out.print("-----+");
        }
        System.out.print("\n+ Legajo +    Sexo   +");
        for (int j = 0; j < nota[0].length; j++) {
            System.out.printf(" N%d  +",j);
        }

        System.out.print("\n+--------+-----------+");
        for (int j = 0; j < nota[0].length; j++) {
            System.out.print("-----+");
        }

        
        for (int i = 0; i < legajo.length; i++) {
            System.out.printf("\n|       %d|%11s|", legajo[i], sexo[i]);
            for (int j = 0; j < nota[i].length; j++) {
                System.out.printf("%5.1f|", nota[i][j]);
            }
        }
        
        System.out.print("\n+--------+-----------+");
        for (int j = 0; j < nota[0].length; j++) {
            System.out.print("-----+");
        }
        System.out.println("");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int largovector = 2;
        int cantnotas = 5;
        int legajo[] = new int[largovector];
        String sexo[] = new String[largovector];
        float nota[][] = new float[largovector][cantnotas];

        System.out.println("NOTAS.");

        for (int i = 0; i < largovector; i++) {
            System.out.println("\nIngrese los datos: ");
            System.out.print("Legajo [" + (i + 1) + "]: ");
            legajo[i] = sc.nextInt();
            System.out.print("Sexo [" + (i + 1) + "]: ");
            sexo[i] = sc.next();
            switch (sexo[i]) {
                case "m":
                    sexo[i]="Masculino";
                    break;
                case "f":
                    sexo[i]="Femenino";
            }
            for (int j = 0; j < cantnotas; j++) {
                System.out.print("Nota de legajo " + legajo[i] + " [" + (j + 1) + "]: ");
                nota[i][j] = sc.nextFloat();
            }
        }
        mostrarDatos(legajo, sexo, nota);
    }
}
