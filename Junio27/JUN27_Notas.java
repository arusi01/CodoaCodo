package cfp10;

import java.util.Scanner;

public class JUN27_Notas {

    public static void ingresarDatos(int legajo[], String sexo[], float nota[][]) {
                
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nIngrese los datos: ");
                    
        for (int i = 0; i < legajo.length; i++) {
            System.out.print("\nNro. Legajo [" + (i + 1) + "]: ");
            legajo[i] = sc.nextInt();
            do {
                System.out.print("Sexo (m/f) [" + (i + 1) + "]: ");
                sexo[i] = sc.next();
            }
            while (!sexo[i].equalsIgnoreCase("m") && !sexo[i].equalsIgnoreCase("f") );

            switch (sexo[i].toLowerCase()) {
                case "m":
                    sexo[i]="Masculino";
                    break;
                case "f":
                    sexo[i]="Femenino";
            }
            for (int j = 0; j < nota[i].length; j++) {
                do {
                    System.out.print("Nota " + (j + 1) + " de legajo " + legajo[i] + " (0-10): ");
                    nota[i][j] = sc.nextFloat();
                } while (nota[i][j] < 0 | nota[i][j] > 10);
            }
        }
    }
    
    public static void buscarDatos(int legajo[], String sexo[], float nota[][]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("\nIngrese el nro.legajo a buscar: ");
        int buscar = sc.nextInt();
        
        boolean encontrado = false;
        int inicio=0;
        
        for (int i = 0; i < legajo.length; i++) {
            if (legajo[i]==buscar) {
                encontrado=true;
                inicio=i;
            }
        }
        
        if (encontrado) {
            System.out.print("\nLEGAJO ENCONTRADO.");
            mostrarDatos(legajo, sexo, nota, inicio);
        }else{
            System.out.println("\nLEGAJO NO ENCONTRADO.");              
        }
                
    }
    
    public static float promedioDatos(float nota[][], int i) {
        float promedio=0;
        for (int j = 0; j < nota[i].length; j++) {
            promedio=promedio+nota[i][j];
        }
        promedio=promedio/nota[i].length;
        return promedio;
    }
    
    public static void mostrarDatos(int legajo[], String sexo[], float nota[][], int inicio) {
             
        String tituloln = "\n+--------+-----------+";
        String tituloln2 = "\n| Legajo |    Sexo   |";
        
        for (int j = 0; j < nota[0].length; j++) {
            tituloln = tituloln+"-----+";
            tituloln2 = tituloln2+String.format(" N%d  |", j+1);
        }
        
        tituloln = tituloln+"--------+";
        tituloln2 = tituloln2+"Promedio|";

        System.out.print(tituloln);
        System.out.print(tituloln2);
        System.out.print(tituloln);

        int fin;
        if (inicio < 0) {
            inicio=0;
            fin = legajo.length;
        }else{
            fin=inicio+1;
        }
       
        for (int i=inicio; i < fin; i++) {
            System.out.printf("\n|%8d|%11s|", legajo[i], sexo[i]);
            for (int j = 0; j < nota[i].length; j++) {
                System.out.printf("%5.1f|", nota[i][j]);
            }
            System.out.printf("%8.1f|",promedioDatos(nota,i));
        }
        
        System.out.println(tituloln);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("NOTAS.");
        
        int largovector=0;
        int cantnotas=0;
        
        do {
            System.out.print("\nCantidad de legajos a ingresar: ");
            largovector = sc.nextInt();
        } while (largovector < 1);

        do {
            System.out.print("Cantidad de notas por legajo: ");
            cantnotas = sc.nextInt();
        } while (cantnotas < 1);

        int legajo[] = new int[largovector];
        String sexo[] = new String[largovector];
        float nota[][] = new float[largovector][cantnotas];

        ingresarDatos(legajo, sexo, nota);
        mostrarDatos(legajo, sexo, nota,-1);

        System.out.println("");
        String confirm = "";
        do {
            System.out.print("Desea buscar un legajo (s/n): ");
            confirm = sc.next();
        } while (!confirm.equalsIgnoreCase("s") && !confirm.equalsIgnoreCase("n"));
        if (confirm.equalsIgnoreCase("s")) {
            buscarDatos(legajo, sexo, nota);
        }
    }
}
