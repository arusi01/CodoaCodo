
package cfp10;

public class MAY16_Multiplicacion {
    public static void main(String[] args) {
        int resultado;
        for(int nro=1;nro<=9;nro++){
            for(int multiplicador=1;multiplicador<=9;multiplicador++){
                resultado=nro*multiplicador;
                System.out.print(nro+"*"+multiplicador+"="+resultado+"  ");
            }
            System.out.println("");
        }
    }    
}
