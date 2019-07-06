
package cfp10;

import java.util.Scanner; // libreria

public class obra {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int Nroobra;
        float FCant,FCsaldo,NC,ND,RCant,RCsaldo,Saldo;
        
        System.out.print("Ingrese el Nro. de la Obra: "); //escribir: impresion con salto de linea
        Nroobra = teclado.nextInt(); //Leer ingresar datos por teclado
        
        System.out.print("Ingrese Importe Factura Anticipo: ");
        FCant = teclado.nextFloat();

        System.out.print("Ingrese Importe Factura Saldo: ");
        FCsaldo = teclado.nextFloat();
        
        System.out.print("Ingrese Importe Nota de Credito: ");
        NC = teclado.nextFloat();
        
        System.out.print("Ingrese Importe Nota de Debito: ");
        ND = teclado.nextFloat();

        System.out.print("Ingrese Importe Recibo Anticipo: ");
        RCant = teclado.nextFloat();

        System.out.print("Ingrese Importe Recibo Saldo: ");
        RCsaldo = teclado.nextFloat();
        
        Saldo=FCant+FCsaldo-NC+ND-RCant-RCsaldo;
        
        System.out.println("El Saldo de la Obe Nro. " + Nroobra + " es $ " +Saldo);

    }
    
}
