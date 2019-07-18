package JUN16_Profe_Estud_3;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante Alberto = new Estudiante(1,"Alberto","Perez",23,"Argentina");
        Profesor Carlos = new Profesor(2,1,"Carlos","Gonzalez",34,"Chilena");
        
        System.out.println(Alberto.toString());
        System.out.println(Carlos.toString());
    }
    
}
