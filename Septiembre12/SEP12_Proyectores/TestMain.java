package SEP12_Proyectores;

import java.util.Scanner;

public class TestMain {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        PaqueteProjectores paq1 = new PaqueteProjectores(1, "Pepe", "Buenos Aires", 100);
        PaqueteProjectores paq2 = new PaqueteProjectores(2, "Laura", "Misiones", 500);

        GestorDePaquetesDeProyectores empresa1 = new GestorDePaquetesDeProyectores("Google");
        GestorDePaquetesDeProyectores empresa2 = new GestorDePaquetesDeProyectores("Amazon");

        empresa1.agregarPaquete(paq1);
        empresa1.agregarPaquete(paq2);
        
        paq1.setEnTransito(true);
        
        empresa1.imprimirPaquete();

        System.out.print("Ingrese paquete a buscar: ");
        int codPaquete = teclado.nextInt();

        empresa1.buscarPaqueteProyector(codPaquete);
        
        
    }
    
}
