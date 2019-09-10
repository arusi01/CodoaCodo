package SEP05_Edificio;

public class TestMain {

    public static void main(String[] args) {
        // TODO code application logic here
        
       Edificio Capital = new Edificio("Maipu 600",5,1);
       Propietario Matias = new Propietario("Posobon",Capital);
       
       Matias.mostrarPropiedad();
    }
    
}
