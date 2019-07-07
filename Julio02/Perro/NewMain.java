package JUN02_Remeras;

public class NewMain {

    public static void main(String[] args) {
        Remeras tomy = new Remeras();
        
        tomy.color="blanca";
        tomy.descripcion="manga corta";
        tomy.precio=450;
        tomy.talle="XL";
        
        tomy.mostrar();
        
        tomy.color="Marron";
        tomy.descripcion="manga larga";
        tomy.precio=530;
        tomy.talle="L";
        
        tomy.mostrar();
        
        
    }
    
}
