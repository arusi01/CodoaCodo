package AGO08_TP_Herencia;

public class Directivo extends Empleado{

    private String nombre;

    public Directivo(String nombre) {
        super(nombre);
    }

    public String toString() {
        return "Directivo{" + "nombre=" + nombre + '}';
    }    
}
