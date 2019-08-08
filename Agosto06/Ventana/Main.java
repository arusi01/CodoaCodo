package AGO08_Ventana;

public class Main {

    public static void main(String[] args) {

         Ventana exterior = new Ventana();
         
         exterior.setMarco(4);
         exterior.setVidrio("templado");
         exterior.setColor("transparente");
         
         System.out.print("Marco es de "+exterior.getMarco());
         System.out.print(" Vidrio "+exterior.getVidrio());
         System.out.print(" Color "+exterior.getColor());
         
         
         Ventana2 interior = new Ventana2(5,"seguridad","opaco");
         
         System.out.println("");
         System.out.println(interior.toString());
    }
}
