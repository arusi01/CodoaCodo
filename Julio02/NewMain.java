package JUN02_Vehiculos;

public class NewMain {

    public static void main(String[] args) {
      
       Automovil mini = new Automovil();
       
       mini.marca="Fiat";
       mini.modelo="E4";
       mini.color="Marron";
       mini.potencia=33;
       mini.precio=3500;
       mini.matricula="ABC123";
       
       mini.aceleracion();
       
       mini.marca="Citroen";
       mini.modelo="RT56";
       mini.color="Azul";
       mini.potencia=20;
       mini.precio=1500;
       mini.matricula="CBA321";
       
       mini.frenar();
    }
    
}
