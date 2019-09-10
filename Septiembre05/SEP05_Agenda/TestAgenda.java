package SEP05_Agenda;

import java.util.Scanner;

public class TestAgenda {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese cantidad de personas: ");
        int tamanio = teclado.nextInt();

        Agenda agenda = new Agenda();

        for (int i = 0; i < tamanio; i++) {
            System.out.print("Ingrese Codigo: ");
            int codigo = teclado.nextInt();
            System.out.print("Ingrese Nombre: ");
            String nombre = teclado.next();

            agenda.agregarPersonas(codigo, nombre);
        }
        
        System.out.println("\nPersonas");
        agenda.mostrarPersonas();

        System.out.print("\nIngrese codigo de persona a borrar: ");
        int codigo = teclado.nextInt();
        agenda.eliminarPersona(codigo);

        System.out.println("\nPersonas");
        agenda.mostrarPersonas();

        System.out.print("\nIngrese codigo de persona a buscar: ");
        int buscarcodigo = teclado.nextInt();
        agenda.buscarPersona(buscarcodigo);

    }

}
