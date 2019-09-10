package SEP10_Ordenes;

public class DetalleOrden {
    
    private Notebook item;
    private float precioUnitario;
    private int cantidad;

    public DetalleOrden(Notebook item, float precioUnitario, int cantidad) {
        this.item = item;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    public Notebook getItem() {
        return item;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void imprimirDetalleOrden() {
        System.out.println("Detalle Orden: \nItem: "+ item.getMarca()
                + " " + item.getModelo()
                + " " + item.getProcesador()
                + " " + item.getTamañoDisco()
                + "\nPrecio Unitario: " + precioUnitario 
                + "\nCantidad: " + cantidad);
    }
}
