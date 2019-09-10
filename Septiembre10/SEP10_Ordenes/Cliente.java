package SEP10_Ordenes;

import java.util.ArrayList;

public class Cliente {
    
    private String nombre;
    private int dni;
    private ArrayList<Orden> ordenes = new ArrayList<>();

    public Cliente(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }
    
    public void addOrden(Orden o) {
        ordenes.add(o);
    }
    
    public void imprimirCliente() {
        System.out.println("Cliente: \nNombre: " + nombre 
                + "\nDni: " + dni);
    }
}
