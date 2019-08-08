package AGO08_TP_Herencia;

public class Operario extends Empleado{

    private String nombre;

    public Operario(String nombre) {
        super(nombre);
    }

    public String toString() {
        return "Operario{" + "nombre=" + nombre + '}';
    }   
}
