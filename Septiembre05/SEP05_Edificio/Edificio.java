package SEP05_Edificio;

public class Edificio {

    private String direccion;
    private int cantDepartamentos;
    private int depRentados;

    public Edificio(String direccion, int cantDepartamentos, int depRentados) {
        this.direccion = direccion;
        this.cantDepartamentos = cantDepartamentos;
        this.depRentados = depRentados;
    }

    @Override
    public String toString() {
        return "Edificio{" + "direccion=" + direccion + ", cantDepartamentos=" + cantDepartamentos + ", depRentados=" + depRentados + '}';
    }
    
    
}
