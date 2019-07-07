package JUN02_Vehiculos;

public class Automovil {

    public String marca;
    public String color;
    public float potencia;
    public float precio;
    public String modelo;
    public String matricula;

    public void aceleracion() {
        System.out.println("\nACELERACION");
        System.out.println("Vehiculo " + marca);
        System.out.println("modelo " + modelo);
        System.out.println("color " + color);
        System.out.println("potencia " + potencia);
        System.out.println("Matricula " + matricula);
        System.out.println("Precio " + precio);
    }

    public void frenar() {
        System.out.println("\nFRENADO");
        System.out.println("Vehiculo " + marca);
        System.out.println("modelo " + modelo);
        System.out.println("color " + color);
        System.out.println("potencia " + potencia);
        System.out.println("Matricula " + matricula);
        System.out.println("Precio " + precio);
    }
}
