package AGO29_Polimorfismo_Vehiculo;

public class Coche extends Vehiculo{

    @Override
    public void mostrarCaracteristiras(String color, String patente, String traccion) {
        System.out.println("Color: "+color+" Patente: "+patente+" Traccion: "+traccion);
    }
    
}
