package AGO08_Ventana;

public class Ventana2 {
    
     private int marco;
     private String vidrio;
     private String color;

    public Ventana2(int marco, String vidrio, String color) {
        this.marco = marco;
        this.vidrio = vidrio;
        this.color = color;
    }

    public String toString(){
        return "Marco: "+marco+" m2 "+" Vidrio es "+vidrio+" de color "+color;
    }  

     
}
