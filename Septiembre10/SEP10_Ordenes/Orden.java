package SEP10_Ordenes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Orden {
    
    private List<DetalleOrden> items;
    private int id;
    private Date creacion;
    private Date envio;

    public Orden(int id, Date creacion) {
        this.id = id;
        this.creacion = creacion;
        envio = new Date();
        this.items = new ArrayList<>();
    }
    
    public void agregarItem(DetalleOrden detalle) {
        items.add(detalle);   
    }

    public int getNroItems() {
        return items.size();
    }
    
    public void setEnvio(Date envio) {
        this.envio=envio;
    }
    
    public Double calcularTotalOrden() {
        double totalOrden=0;
        for(int i=0; i < items.size(); i++){
             totalOrden=totalOrden+items.get(i).getPrecioUnitario();
        }
        return totalOrden;
    }
    
    public void imprimirOrden() {        
        System.out.println(items);
    }
}
