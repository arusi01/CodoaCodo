package UN01_EJ08_Motocicleta;

public class Main {

    public static void main(String[] args) {

        Motocicleta Yamaha = new Motocicleta("123ABC","Azul",100,false);
        
        Yamaha.arrancar();
        Yamaha.acelerar();
        Yamaha.frenar();
        Yamaha.girar();
    } 
}
