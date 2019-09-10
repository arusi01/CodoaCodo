package SEP10_Ordenes;

import java.util.Date;

public class TestMain {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Cliente Roberto = new Cliente("Perez",21123123);
        
        Notebook Acer = new Notebook("Acer","One","Intel",120);
        Date creacion = new Date(25, 23, 2018);
        Date envio = new Date();
        Orden principal = new Orden(1,creacion);
        
        DetalleOrden Pantalla = new DetalleOrden(Acer,1000,1);
        
        principal.agregarItem(Pantalla);
        principal.setEnvio(envio);
        principal.calcularTotalOrden();
        
        Roberto.imprimirCliente();
        Acer.imprimirDetalleNotebook();
        Pantalla.imprimirDetalleOrden();
        
    }    
}
