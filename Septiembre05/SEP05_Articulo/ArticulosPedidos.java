package SEP05_Articulo;

public abstract class ArticulosPedidos {
    
    private int cantidad;
    private Articulo articulo;

    public ArticulosPedidos(int cantidad, Articulo articulo) {
        this.cantidad = cantidad;
        this.articulo = articulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public double getPrecioiOrden(){
        double precioOrden=0;
        precioOrden=cantidad*articulo.getCosto();
        return precioOrden;
    }
}
