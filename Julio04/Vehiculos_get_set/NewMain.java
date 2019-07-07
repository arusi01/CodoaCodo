package JUN04_Vehiculos_get_set;

import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Vehiculos auto = new Vehiculos();

        auto.setFabricante("Fiat");
        auto.setMatricula("ABC123");
        auto.setVelmax(100);
        auto.setAñofab(1986);

        float tiempo;
        float velocidad;
        int opcion=0;

        System.out.println("VEHICULO");
        System.out.println("1. Arrancar");
        System.out.println("2. Acelerar");
        System.out.println("3. Frenar");
        System.out.println("4. Apagar");
        System.out.println("5. Salir");

        do {
            System.out.print("\nElija una accion (1-5): ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    auto.arrancar();
                    break;
                case 2:
                    tiempo = 2;
                    velocidad = (int) Math.floor((Math.random() * (101)));
                    auto.acelerar(velocidad,tiempo);
                    break;
                case 3:
                    auto.frenar();
                    break;
                case 4:
                    auto.apagar();
                    break;
            }
        } while (opcion < 5);

    }

}
