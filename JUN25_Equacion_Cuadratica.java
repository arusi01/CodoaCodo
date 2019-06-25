package cfp10;

import java.util.Scanner;

public class JUN25_Equacion_Cuadratica {

    public static void cuadratica(double a, double b, double c) {
        double discriminante, x1, x2;
        
        discriminante = ((b * b) - (4 * (a * c)));

        if (discriminante < 0) {
            System.out.println("\nLa Ecuacion No Tiene Soluciones Reales");
        }

        if (discriminante == 0) {
            System.out.println("\nLa ecuacion tiene solo una raiz real");
            x1 = (-b) / (2 * a);
            System.out.println("La Solucion es, X1=X2 : " + x1);
        }

        if (discriminante > 0) {
            System.out.println("\nLa ecuacion tiene dos raizes reales");
            x1 = ((-b) + Math.sqrt(discriminante)) / (2 * a);
            x2 = ((-b) - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("La Solucion es, X1 = " + x1 + " y, X2 = " + x2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Equacion Cuadriatica:");

        double a, b, c;
        System.out.print("Ingrese el Coeficiente de A? ");
        a = sc.nextDouble();
        System.out.print("Ingrese el Coeficiente de B? ");
        b = sc.nextDouble();
        System.out.print("Ingrese el Coeficiente de C? ");
        c = sc.nextDouble();
        
        if(a==0 | b==0 | c==0) {
             System.out.println("\nValores Erroneos");
        }else{
             cuadratica(a,b,c);
        }

    }
}
