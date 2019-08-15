package AGO13_Biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Biblioteca ejemplar = new Biblioteca();

        ArrayList<Biblioteca> listaLibros = new ArrayList<>();
        
        ejemplar.cargarEstante(listaLibros);
        
        Object objMay=new Object();
        objMay=ejemplar.mostrarMayorPrecio(listaLibros).getPrecioLibro();
        System.out.println("\nLibro con mayor precio: "+objMay);
        
        System.out.println("\nIngrese el codigo del libro a eliminar: ");
        int codLibro=teclado.nextInt();
        ejemplar.eliminarLibro(listaLibros, codLibro);
        
        System.out.print("\nLibros:");
        List<Biblioteca> mostrar = ejemplar.mostrarLibros(listaLibros);
        for (int i = 0; i < mostrar.size(); i++) {
            Biblioteca get = mostrar.get(i);
            System.out.println("Codigo Libro: " + get.getCodigoLibro()
                    + " N Estante: " + get.getNunEstante()
                    + " Nombre Libro: " + get.getNombreLibro()
                    + " Precio: " + get.getPrecioLibro());
        }
        
        System.out.println("\nIngrese el codigo del libro a buscar: ");
        int codLibroBuscar=teclado.nextInt();
        ejemplar.encontrarLibro(listaLibros, codLibroBuscar);
        
        System.out.println("\nIngrese el codigo del libro a buscar2: ");
        int codLibroBuscar2 = teclado.nextInt();
        if (ejemplar.encontrarLibro2(listaLibros, codLibroBuscar)) {
            System.out.println("\nLibro Encontrado.");
        } else {
            System.out.println("\nLibro NOOOO Encontrado.");
        }

        System.out.print("\nLibros ordenados por precio:");
        List<Biblioteca> ordenar = ejemplar.ordenarPrecio(listaLibros);
        for (int i = 0; i < ordenar.size(); i++) {
            Biblioteca get = ordenar.get(i);
            System.out.println("Codigo Libro: " + get.getCodigoLibro()
                    + " N Estante: " + get.getNunEstante()
                    + " Nombre Libro: " + get.getNombreLibro()
                    + " Precio: " + get.getPrecioLibro());
        } 
    }
}
