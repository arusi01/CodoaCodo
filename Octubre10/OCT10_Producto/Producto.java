package OCT10_Producto;

public class Producto {
    
    private String id;
    private String producto;
    private String precio;

    public Producto(String id, String producto, String precio) {
        this.id = id;
        this.producto = producto;
        this.precio = precio;
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

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    
    
}
