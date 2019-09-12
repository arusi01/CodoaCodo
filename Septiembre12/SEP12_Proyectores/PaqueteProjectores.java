package SEP12_Proyectores;

public class PaqueteProjectores {

    private int codDePaqueteDeProyectores;
    private String destinatario;
    private String destino;
    private float costoEnvio;
    private boolean enTransito;

    public PaqueteProjectores(int codPaquete, String destinatario, String destino, float costoEnvio) {
        this.codDePaqueteDeProyectores = codPaquete;
        this.destinatario = destinatario;
        this.destino = destino;
        this.costoEnvio = costoEnvio;
    }

    public void setCodPaquete(int cod) {
        this.codDePaqueteDeProyectores = cod;
    }
    
    public int getCodPaquete() {
        return codDePaqueteDeProyectores;
    }

    public void setEnTransito(boolean enTransito) {
        this.enTransito = enTransito;
    }
    
    public boolean getEnTransito() {
        return enTransito;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public void mostrarPaquete() {
        System.out.print("Codigo de Paquete: "+codDePaqueteDeProyectores);
        System.out.print(" Destinatario: "+destinatario);
        System.out.print(" Destino: "+destino);
        System.out.print(" Costo: "+costoEnvio);
        if (enTransito) {
            System.out.println(" Enviado");
        }else{
            System.out.println(" NO despachado");            
        }
    }
}
