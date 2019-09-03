package SEP03_Factura;

public class Factura {
    
    private int numero;
    private Televisor tv;
    private EquipoSonido equipo;
    private double pctDescuento;

    public Factura() {
    }

    public Factura(int numero, Televisor tv, EquipoSonido equipo, double pctDescuento) {
        this.numero = numero;
        this.tv = tv;
        this.equipo = equipo;
        this.pctDescuento = pctDescuento;
    }

    public void capturarDctoTV(){
        
    }
    
}
