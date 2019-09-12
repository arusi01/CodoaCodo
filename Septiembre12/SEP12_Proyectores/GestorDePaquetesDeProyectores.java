package SEP12_Proyectores;

import java.util.ArrayList;
import java.util.List;

public class GestorDePaquetesDeProyectores {
    
    private List<PaqueteProjectores> paquetes;
    private String nombreEmpresa;

    public GestorDePaquetesDeProyectores(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        paquetes = new ArrayList<>();
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombre) {
        this.nombreEmpresa = nombre;
    }
    
    public void agregarPaquete(PaqueteProjectores paqueteNuevo) {
        paquetes.add(paqueteNuevo);
    }
    
    public void imprimirPaquete() {
        System.out.println("\nDetalle Paquete de Empresa: "+nombreEmpresa);
        for(int i=0; i < paquetes.size(); i++){
             paquetes.get(i).mostrarPaquete();             
        }
    }
    
    public void buscarPaqueteProyector(int codPaquete) {
        boolean encontrado = false;
        System.out.println("\nBuscando paquete: "+codPaquete);
        for (int i = 0; i < paquetes.size(); i++) {

            if (paquetes.get(i).getCodPaquete() == codPaquete) {
                System.out.println("Paquete Encontrado");
                paquetes.get(i).mostrarPaquete();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Paquete NO Encontrado");
        }
    }
}
