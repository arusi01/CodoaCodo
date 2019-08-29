package AGO29_Polimorfismo_Vehiculo;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo barco = new Barco();
        barco.mostrarCaracteristiras("Azul", "ABC123", "A vela");
        
        Vehiculo coche = new Coche();
        coche.mostrarCaracteristiras("Verde", "AAA345", "Ruedas");
        
        Vehiculo coche1 = new Coche();
        coche.mostrarCaracteristiras("Amarillo", "AAZ321", "RUEDAS");
        
        Barco b = new Barco();
        b.mostrar(); // Herencia
        
        Vehiculo c = new Barco();
        c.mostrar();
    }
}
