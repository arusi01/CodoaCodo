package SEP03_Factura;

public class EquipoSonido extends Aparato {
    
    private int cantidadCDs;

    public EquipoSonido() {
    }

    public EquipoSonido(int cantidadCDs) {
        this.cantidadCDs = cantidadCDs;
    }

    public EquipoSonido(int cantidadCDs, int voltaje, double precio) {
        super(voltaje, precio);
        this.cantidadCDs = cantidadCDs;
    }

    public int getCantidadCDs() {
        return cantidadCDs;
    }
    
    
    
}
