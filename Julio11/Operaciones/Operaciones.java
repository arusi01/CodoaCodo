package JUN11_Operaciones;

public class Operaciones {

    private int nro1;
    private int nro2;
    
    public Operaciones(int nro1, int nro2) { // Construye Objetos
        this.nro1=nro1;
        this.nro2=nro2;
    }

    public int suma() {        
        int resultado=nro1+nro2;
        return (resultado);
    }
    
    public int resta() {
        int resultado=nro1-nro2;
        return (resultado);
    }    

    public int multiplicacion() {
        int resultado=nro1*nro2;
        return (resultado);
    }        
}
