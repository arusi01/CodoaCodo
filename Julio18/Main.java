package JUN18_Arraylist_Metodos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<>();
        cargarLista(lista);

        System.out.print("\nIngrese Nombre a eliminar: ");
        String nombre = teclado.next();

        removerLista(lista, nombre);

        mostrarLista(lista);

    }

    public static void cargarLista(List<String> lista) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese cantidad de datos: ");
        int largo = teclado.nextInt();

        for (int i = 0; i < largo; i++) {
            System.out.print("Posicion N° [" + i + "]: ");
            String nombre = teclado.next();
            lista.add(nombre);
        }
    }

    public static void removerLista(List<String> lista, String nombre) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(nombre)) {
                lista.remove(i);
            }
        }
    }

    public static void mostrarLista(List<String> lista) {
        System.out.println("");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("La nueva lista es: " + lista.get(i));
        }
    }
}
