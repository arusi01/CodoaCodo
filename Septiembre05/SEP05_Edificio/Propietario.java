package SEP05_Edificio;

public class Propietario {

    private String nombre;
    private Edificio propiedad;

    public Propietario(String nombre, Edificio propiedad) {
        this.nombre = nombre;
        this.propiedad = propiedad;
    }

    public void mostrarPropiedad() {
        System.out.println("Propietario "+nombre);
        System.out.println(propiedad.toString());
        
    }    
}
