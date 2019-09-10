package SEP10_Ordenes;

public class Notebook {
    
    private String marca;
    private String modelo;
    private String procesador;
    private float tamañoDisco;

    public Notebook(String marca, String modelo, String procesador, float tamañoDisco) {
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.tamañoDisco = tamañoDisco;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getProcesador() {
        return procesador;
    }

    public float getTamañoDisco() {
        return tamañoDisco;
    }

    public void imprimirDetalleNotebook() {
        System.out.println("Notebook: "+marca
                + "\nModelo: " + modelo 
                + "\nProcesador: " + procesador 
                + "\nTamaño de Disco: " + tamañoDisco);
    }
    
    
}
