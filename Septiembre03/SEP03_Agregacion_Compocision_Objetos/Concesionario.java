package SEP03_Agregacion_Compocision_Objetos;

import java.util.ArrayList;

public class Concesionario { // CLASE TODO
    
    private String compania;
    // consecionario tiene un gerente
    private Gerente gerente; // CARDINALIDAD 1 - 1
    // consecionario tiene muchos vendedores 
    private ArrayList<Vendedor> vendedor = new ArrayList<>(); // CARDINALIDAD 1 a * muchos
    // consecionario tiene muchas carros
    private ArrayList<Carro> carros = new ArrayList<>();

    public Concesionario(String compania, Gerente gerente) {
        this.compania = compania;
        this.gerente = gerente;
    }
    
    // Metodos para agregar los autos
    public void addCar(Carro carro) { //coloc mi referencia de autos
        carros.add(carro);
    }
    
    //**** metodo para agergar personas
    public void addVendedores(Vendedor vendedores){
        vendedor.add(vendedores);        
    }
    
    public void imprimirConc(){
        System.out.println(compania+"\t"+gerente.getNombre());
        for (Vendedor vendedores : vendedor) {
            System.out.println(vendedores.getNombre());            
        }
        
        for (Carro car : carros) {
            System.out.println(car.getMarca());
        }
    }
    
    
    
}
