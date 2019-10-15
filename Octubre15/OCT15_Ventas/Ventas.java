package OCT15_Ventas;

public class Ventas {

     private int codigo;
     private String nombre;
     private Double precio;
     private Double descuento;

    public Ventas(int codigo, String nombre, Double precio, Double descuento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.descuento = descuento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }
     
     
}
