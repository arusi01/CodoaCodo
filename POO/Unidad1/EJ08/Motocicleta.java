package UN01_EJ08_Motocicleta;

public class Motocicleta {
    
    private String Matricula;
    private String Color;
    private int Velocidad;
    private boolean enMarcha;
    
    public Motocicleta(String Matricula, String Color, int Velocidad, boolean enMarcha) {
        this.Matricula=Matricula;
        this.Color=Color;
        this.Velocidad=Velocidad;
        this.enMarcha=enMarcha;
    }
    
    public void arrancar() {
        if (enMarcha) {
            System.out.println("La motocicleta " + Matricula + " ya esta en marcha");
        } else {
            System.out.println("La motocicleta " + Matricula + " arranco correctamente.");
        }
    }
    
    public void acelerar() {
        System.out.println("Acelerando Motocicleta "+Matricula+" de color "+Color+" max.velocidad "+Velocidad);    
    }
    
    public void frenar() {
        System.out.println("Frenando Motocicleta "+Matricula+" de color "+Color+" max.velocidad "+Velocidad);    
        
    }
    
    public void girar() {
        System.out.println("Girando Motocicleta "+Matricula+" de color "+Color+" max.velocidad "+Velocidad);    
        
    }
}
