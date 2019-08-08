package AGO08_TP_Herencia;

public class Tecnico extends Operario{

    private String nombre;

    public Tecnico(String nombre) {
        super(nombre);
    }

    public String toString() {
        return "Tecnico{" + "nombre=" + nombre + '}';
    }
}
