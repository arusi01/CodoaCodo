package OCT10_Producto2;

public class Producto {
    
    private String id;
    private String producto;
    private Double precio;
    private int Cant;

    public Producto(String id, String producto, Double precio, int Cant) {
        this.id = id;
        this.producto = producto;
        this.precio = precio;
        this.Cant = Cant;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCant() {
        return Cant;
    }

    public void setCant(int Cant) {
        this.Cant = Cant;
    }

    
}
