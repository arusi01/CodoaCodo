package JUN16_Profe_Estud_2;

public class Main {

    public static void main(String[] args) {

        Estudiante Alberto = new Estudiante();
        Profesor Carlos = new Profesor();
        
        Alberto.setLegajo(3);
        Alberto.setNombre("Alberto");
        Alberto.setApellido("Perez");
        Alberto.setEdad(23);
        Alberto.setNacionalidad("Argentina");
        
        Carlos.setCursos(2);
        Carlos.setNombre("Carlos");
        Carlos.setApellido("Gonzalez");
        Carlos.setEdad(35);
        Carlos.setNacionalidad("Chilena");
        
        System.out.println(Alberto.toString());
        System.out.println(Carlos.toString());        // TODO code application logic here
    }
    
}
