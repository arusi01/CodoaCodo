package JUN02_Perro;

public class NewMain {

    public static void main(String[] args) {

        Perro foxterrier = new Perro();
        Perro Doberman = new Perro();
        Perro Salchicha = new Perro();
        
        foxterrier.color="Blanco y Negro";
        foxterrier.edad=3;
        foxterrier.raza="terrier";
        foxterrier.tamaño="grande";

        foxterrier.mostrar();        
        foxterrier.comer();
        foxterrier.correr();
        foxterrier.dormir();
        foxterrier.ladrido();
                
    }
    
}
