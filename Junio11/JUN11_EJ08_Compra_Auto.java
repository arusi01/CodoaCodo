package cfp10;

import java.util.Scanner;

public class JUN11_EJ08_Compra_Auto {

    public static double montoPrima(int monto) {
        double prima = monto * 0.35;
        return (prima);
    }

    public static double montoCuota(int monto) {
        double cuota = (monto * 0.65)/18;
        return (cuota);
    }
    
       public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Compra Auto.");
        System.out.println("");

        System.out.print("Ingrese precio: ");
        int monto = sc.nextInt();

        System.out.printf("%nLa prima es $ %.2f y el importe de la cuota $ %.2f%n", montoPrima(monto), montoCuota(monto) );
    }
}
