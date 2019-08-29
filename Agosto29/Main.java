package AGO29_Aerosub;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Aerosub avion = new Aerosub();
        avion.Despegar();
        avion.Acuatizar();
        
        Aerosub barco = new Aerosub();
        barco.Sumergir();
        barco.Emerger();
        
    }
    
}
