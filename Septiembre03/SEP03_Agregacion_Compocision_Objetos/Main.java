package SEP03_Agregacion_Compocision_Objetos;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Gerente Matias = new Gerente("Posobon Matias");
        Vendedor nicole = new Vendedor("nicole sanchez");
        Vendedor pepe = new Vendedor("pepe ");
        
        Concesionario concesionario = new Concesionario("POSOBON", Matias);

        //para agregacion paso referencias
        concesionario.addVendedores(nicole);
        concesionario.addVendedores(pepe);

        // PARA composicion paso objetos anonimos
        concesionario.addCar(new Carro("Fiat"));
        concesionario.addCar(new Carro("Ford"));
        concesionario.addCar(new Carro("Dodge"));
        
        concesionario.imprimirConc();
        
    }
    
}
