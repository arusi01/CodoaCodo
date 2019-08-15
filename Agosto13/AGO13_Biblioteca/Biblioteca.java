package AGO13_Biblioteca;

import java.util.List;
import java.util.Scanner;

public class Biblioteca {

    //Atributos
    private String nombreLibro;
    private int codigoLibro;
    private int nunEstante;
    private int precioLibro;

    public Biblioteca() {
    }

    public Biblioteca(String nombreLibro, int codigoLibro, int nunEstante, int precioLibro) {
        this.nombreLibro = nombreLibro;
        this.codigoLibro = codigoLibro;
        this.nunEstante = nunEstante;
        this.precioLibro=precioLibro;
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

    public int getPrecioLibro() {
        return precioLibro;
    }

    public void setPrecioLibro(int precioLibro) {
        this.precioLibro = precioLibro;
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
            System.out.print("Precio: ");
            int precioLibro = teclado.nextInt();
            
            Biblioteca ejemplar = new Biblioteca(nombreLibros, codigoLibros, nunEstantes, precioLibro);

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
        int encontrado=0;
        for (int i = 0; i < libro.size(); i++) {
            if (libro.get(i).getCodigoLibro() == codigo) {
                 System.out.println("\nMetodo 1: Libro Encontrado.");
                 encontrado=1;
            }            
        }
        if (encontrado==0){
            System.out.println("\nMetodo 1: Libro NOOO Encontrado.");
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
            if (libro.get(i).getPrecioLibro()>mayor.getPrecioLibro()) {
                mayor=libro.get(i);
            }
        }
        return mayor;        
    }
    
    public List<Biblioteca> ordenarPrecio(List<Biblioteca> libro) {
        
        Biblioteca aux = null;
    
        for (int pasada = 0; pasada < libro.size() - 1; pasada++) {        
            for (int posicion = pasada; posicion < libro.size() - 1; posicion++) {
                for (int posicion2 = 0; posicion2 < libro.size() - posicion - 1; posicion2++) {
                    if (libro.get(posicion2).getPrecioLibro() > libro.get(posicion2+1).getPrecioLibro()) {
                        aux = libro.get(posicion2);
                        libro.set(posicion2, libro.get(posicion2+1));
                        libro.set(posicion2+1, aux);
                    }
                }
            }
        }
        return libro;
    }
}
