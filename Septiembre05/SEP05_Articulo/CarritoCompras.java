package SEP05_Articulo;

import java.util.ArrayList;

public class CarritoCompras {

    private ArrayList<ArticulosPedidos> CarritoCompras = new ArrayList<>();

    public CarritoCompras() {
    }
    
    public void addArticulo(ArticulosPedidos iOrden){
        CarritoCompras.add(iOrden);
    }
    
    public void quitar(ArticulosPedidos riOrden) {
        for (int i = 0; i < CarritoCompras.size(); i++) {
            if (CarritoCompras.get(i).equals(riOrden)) {
                CarritoCompras.remove(i);
            }
        }
    }
    
    public boolean buscarArticulo(ArticulosPedidos sOrden) {
        boolean encontrado=false;
        for (int i = 0; i < CarritoCompras.size(); i++) {
            if (CarritoCompras.get(i).equals(sOrden)) {
                encontrado=true;
            }
        }
        return encontrado;
    }
    
    public double getTotalPrecio() {
        double precioTotal=0;
        for (int i = 0; i < CarritoCompras.size(); i++) {
            precioTotal=precioTotal+(CarritoCompras.get(i).getCantidad()
                    *CarritoCompras.get(i).getPrecioiOrden());
        }        
        return precioTotal;
    }
}
