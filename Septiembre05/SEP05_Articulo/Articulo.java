package SEP05_Articulo;

public class Articulo {
    private String iNombre;
    private double costo;

    public Articulo(String iNombre, double costo) {
        this.iNombre = iNombre;
        this.costo = costo;
    }

    public String getiNombre() {
        return iNombre;
    }

    public void setiNombre(String iNombre) {
        this.iNombre = iNombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }    
}
