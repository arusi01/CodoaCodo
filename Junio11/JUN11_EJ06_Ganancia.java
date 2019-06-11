package cfp10;

import java.util.Scanner;

public class JUN11_EJ06_Ganancia {

    public static double invGanancia(double capital) {
        double ganancia = capital * 0.02;
        return (ganancia);
    }

    public static double totGanancia(double ganancia, double capital) {
        double total = ganancia + capital;
        return (total);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ganancia Inversion.");
        System.out.println("");

        System.out.print("Ingrese capitad invertido: ");
        double capital = sc.nextDouble();

        System.out.printf("%nLa ganancia es $ %.2f, el importe a cobrar $ %.2f%n", invGanancia(capital), totGanancia(invGanancia(capital),capital) );
    }
}
