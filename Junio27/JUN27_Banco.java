package cfp10;

import java.util.Scanner;

public class JUN27_Banco {
    
    public static void mostrarCtas(int numero[], String tipo[], float saldo[]) {
        System.out.println("");
        System.out.println("Datos Ingresados: ");
        int index = 0;
        for (int nrocta : numero) {   //FOREACH
            System.out.println("Nro. de Cuenta: " + nrocta + "\tTipo: " + tipo[index] + "\tSaldo: " + saldo[index]);
            index++;
        }
    }
    
    public static void buscarCta(int numero[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nIngrese numero de cuenta a buscar:");
        int busqueda = sc.nextInt();
        
        boolean encontrado = false;
        
        for (int nrocta : numero) {   //FOREACH

            if (nrocta==busqueda) {
                encontrado = true;
            }

        }
        if (encontrado) {
            System.out.println("\nCUENTA ENCONTRADA");
        } else {
            System.out.println("\nCUENTA NO ENCONTRADA");
        }
    }
    
    public static void ordenarCtas(int numero[], String tipo[], float saldo[]) {
        int aux;
        String tipoaux;
        float saldoaux;
        System.out.println("\nOrdenando las cuentas por el numero.");
        
        for (int pasada = 0; pasada < numero.length - 1; pasada++) {
            for (int posicion = pasada; posicion < numero.length - 1; posicion++) {
                for (int posicion2 = 0; posicion2 < numero.length - posicion - 1; posicion2++) {
                    if (numero[posicion2] > numero[posicion2 + 1]) {
                        aux = numero[posicion2];
                        numero[posicion2] = numero[posicion2 + 1];
                        numero[posicion2 + 1] = aux;
                        
                        tipoaux = tipo[posicion2];
                        tipo[posicion2] = tipo[posicion2 + 1];
                        tipo[posicion2 + 1] = tipoaux;
                        
                        saldoaux = saldo[posicion2];
                        saldo[posicion2] = saldo[posicion2 + 1];
                        saldo[posicion2 + 1] = saldoaux;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int largovector = 5;
        int numero[] = new int[largovector];
        String tipo[] = new String[largovector];
        float saldo[] = new float[largovector];

        System.out.println("Banco Modesto.");

        for (int i = 0; i < largovector; i++) {
            System.out.println("\nIngrese los datos de la cuenta: ");
            System.out.print("Numero [" + (i + 1) + "]: ");
            numero[i] = sc.nextInt();
            System.out.print("Tipo [" + (i + 1) + "]: ");
            tipo[i] = sc.next();
            System.out.print("Saldo [" + (i + 1) + "]: ");
            saldo[i] = sc.nextFloat();
        }

        mostrarCtas(numero, tipo, saldo);
        buscarCta(numero);

        System.out.println("");
        String confirm = "";
        do {
            System.out.print("Desea Ordenar las cuentas por numero (s/n): ");
            confirm = sc.next();
        } while (!confirm.equalsIgnoreCase("s") && !confirm.equalsIgnoreCase("n"));
        if (confirm.equalsIgnoreCase("s")) {
            ordenarCtas(numero, tipo, saldo);
            mostrarCtas(numero, tipo, saldo);
        }

    }
}
