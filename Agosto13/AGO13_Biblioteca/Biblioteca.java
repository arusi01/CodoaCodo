package AGO13_Biblioteca;

import java.util.List;
import java.util.Scanner;

public class Biblioteca {

    //Atributos
    private String nombreLibro;
    private int codigoLibro;
    private int nunEstante;

    public Biblioteca() {
    }

    public Biblioteca(String nombreLibro, int codigoLibro, int nunEstante) {
        this.nombreLibro = nombreLibro;
        this.codigoLibro = codigoLibro;
        this.nunEstante = nunEstante;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public int getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(int codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public int getNunEstante() {
        return nunEstante;
    }

    public void setNunEstante(int nunEstante) {
        this.nunEstante = nunEstante;
    }

    public void cargarEstante(List<Biblioteca> libro) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("\nIngrese el tamaño del arreglo: ");
        int tamanio = teclado.nextInt();

        for (int i = 0; i < tamanio; i++) {

            System.out.println("\nIngrese los datos del libro " + i);

            System.out.print("Codigo ISBN: ");
            int codigoLibros = teclado.nextInt();
            System.out.print("Nombre: ");
            String nombreLibros = teclado.next();
            System.out.print("Estante: ");
            int nunEstantes = teclado.nextInt();

            Biblioteca ejemplar = new Biblioteca(nombreLibros, codigoLibros, nunEstantes);

            //agregamos a la lista
            libro.add(ejemplar);
        }  
    }       

    public List<Biblioteca> eliminarLibro(List<Biblioteca> libro, int codigo) {
        for (int i = 0; i < libro.size(); i++) {
            if (libro.get(i).getCodigoLibro()==codigo) {
                libro.remove(i);
            }
        }
        return libro;
    }

    public List<Biblioteca> mostrarLibros(List<Biblioteca> libro) {
        return libro;
    }

    public List<Biblioteca> encontrarLibro(List<Biblioteca> libro, int codigo) {
        for (int i = 0; i < libro.size(); i++) {
            if (libro.get(i).getCodigoLibro() == codigo) {
                 System.out.println("\nLibro Encontrado.    1");
            }else{
                 System.out.println("\nLibro NOOO Encontrado.   1");

            }
        }
        return libro;
    }
    
    public boolean encontrarLibro2(List<Biblioteca> libro, int codigo) {
        boolean encontrado = false;
        for (int i = 0; i < libro.size(); i++) {
            if (libro.get(i).getCodigoLibro() == codigo) {
                encontrado=true;
            }
        }
        return (encontrado);
    }
    
    public Biblioteca mostrarMayorPrecio(List<Biblioteca> libro) {
        Biblioteca mayor = libro.get(0);
        for (int i = 0; i < libro.size(); i++) {
            if (libro.get(i).getPrecio() =) {
                encontrado=true;
            }
        }        
    }
}
