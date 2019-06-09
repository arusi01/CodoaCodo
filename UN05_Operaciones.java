package cfp10;

public class UN05_Operaciones {
 
    public static int sumaEnteros (int a,int b) {
        int resultado = a+b;
        return resultado;
    }
    
    public static void main(String[] args) {
//      Operaciones op=new Operaciones();    instanciar sin static
//      op.sumaEnteros(2,3);

        int resultado=sumaEnteros(2,3)+sumaEnteros(8,4);
        
        System.out.println("LA suma es "+resultado);
    }    
}
