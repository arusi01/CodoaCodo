package SEP03_Factura;

public class Televisor extends Aparato {

    private double tamanio;

    public Televisor() {
    }

    public Televisor(double tamanio) {
        this.tamanio = tamanio;
    }

    public Televisor(double tamanio, int voltaje, double precio) {
        super(voltaje, precio);
        this.tamanio = tamanio;
    }

    public double getTamanio() {
        return tamanio;
    }

}
