package JUN04_Persona;

public class NewMain {

    public static void main(String[] args) {

                //objeto dani
        Persona dani = new Persona();  // instancia de la clase
                           //constructor

        dani.setNombre("Dani");
        dani.setDni(2323);
        dani.setEdad(34);
        dani.setSexo('m');
        
        System.out.println("Nombre:"+dani.getNombre());
        
        dani.mostrar();
    }
}
