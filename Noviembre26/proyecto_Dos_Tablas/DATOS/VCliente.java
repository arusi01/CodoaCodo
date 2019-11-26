package DATOS;

public class VCliente extends VPersona{
    
    private String codigo_cliente;

    public VCliente(String codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    public VCliente() {
    }

    public String getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(String codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }
    
    

    
    
    
}

