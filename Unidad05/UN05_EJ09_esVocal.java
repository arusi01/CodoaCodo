package cfp10;

import java.util.Scanner;

public class UN05_EJ09_esVocal {

    public static boolean esVocal(char letra) {
        
        boolean vocal;

        switch (Character.toLowerCase(letra)) {
            case 'a':
                vocal = true;
                break;
            case 'e':
                vocal = true;
                break;
            case 'i':
                vocal = true;
                break;
            case 'o':
                vocal = true;
                break;
            case 'u':
                vocal = true;
                break;
            default:
                vocal = false;
                break;
        }
        return (vocal);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("El caracter es vocal o no?");
        System.out.println("");

        System.out.print("Ingrese una letra: ");
        char letra = sc.next().charAt(0);


        System.out.println("");
        if (esVocal(letra)) {
            System.out.println("El caracter ingresado es una letra vocal");
        } else {
            System.out.println("El caracter ingresado NO es una vocal");
        }
    }
}
