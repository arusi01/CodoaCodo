package JUN11_Operaciones;

public class Main {

    public static void main(String[] args) {
        
        Operaciones oper1 = new Operaciones(4,5);
        Operaciones oper2 = new Operaciones(20,6); 
        
        System.out.println("Suma: "+oper1.suma());
        System.out.println("Resta: "+oper1.resta());
        System.out.println("Multiplicacion:"+oper1.multiplicacion());

        System.out.println("Suma: "+oper2.suma());
        System.out.println("Resta: "+oper2.resta());
        System.out.println("Multiplicacion:"+oper2.multiplicacion());        
    }
    
}
