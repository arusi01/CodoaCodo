package JUN02_Perro;

public class Perro {
    
    public String raza;
    public String tamaño;
    public int edad;
    public String color;
    
    public void comer(){
        System.out.println("Comiendo trocitos de Top Nutrition.");
    }
    
    public void dormir(){
        System.out.println("Me voy a dormir.");
    }
    
    public void correr(){
        System.out.println("Al parque a correr.");
    }
    
    public void ladrido(){
        System.out.println("Ruidos, ladrando.");
    }
    
    public void mostrar(){
        System.out.println("El perro "+raza+" de tamaño "+tamaño+" y color "+color+" su edad es "+edad);
    }
}
