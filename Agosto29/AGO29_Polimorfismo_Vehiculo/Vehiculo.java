package AGO29_Polimorfismo_Vehiculo;

public abstract class Vehiculo { // Clase padre o super clase
    //una clase que no se puede instanciar
    
    public String nombre= "DANIEL";
    
    public abstract void mostrarCaracteristiras(String color, String patente, String traccion);
    //Plantilla
    
    public void mostrar(){
        System.out.println("Nombre: "+nombre);
    }
    
}
