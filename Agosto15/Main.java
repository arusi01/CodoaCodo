package AGO15_ConpareTo;

public class Main {

    public static void main(String[] args) {

        String cadena1 = new String("hola");
        String cadena2 = new String("Hola");

        if (cadena2.compareTo(cadena1) == 0) {
            System.out.println("cadenas iguales");
        } else {
            System.out.println("cadenas distintas");
        }
    }
}
