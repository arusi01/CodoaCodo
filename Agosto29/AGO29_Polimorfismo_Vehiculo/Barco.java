package AGO29_Polimorfismo_Vehiculo;

public class Barco extends Vehiculo{

    @Override
    public void mostrarCaracteristiras(String color, String patente, String traccion) {
        System.out.println("Color: "+color+" Patente: "+patente+" Traccion: "+traccion);
    }


    @Override
    public void mostrar() {
        super.mostrar();
    }
    

}
