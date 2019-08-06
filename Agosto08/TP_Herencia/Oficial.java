package AGO08_TP_Herencia;

public class Oficial extends Operario{

    private String nombre;

    public Oficial(String nombre) {
        super(nombre);
    }

    public String toString() {
        return "Oficial{" + "nombre=" + nombre + '}';
    }   
}
