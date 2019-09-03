package SEP03_Factura;

public abstract class Aparato {

    private int voltaje;
    private double precio;

    public Aparato() {
    }

    public Aparato(int voltaje, double precio) {
        this.voltaje = voltaje;
        this.precio = precio;
    }

    public int getVoltaje() {
        return voltaje;
    }
    
    public void setVoltaje(int voltaje) {
        this.voltaje = voltaje;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public double calcularDesc(double descuento) {
        
        return
    }
}
