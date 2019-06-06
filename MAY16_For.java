
package cfp10;

public class MAY16_For {
    public static void main(String[] args) {
        for(int contador1=0;contador1<=9;contador1++){
            for(int contador2=0;contador2<=9;contador2++){
                if (contador1==0 || contador1==9 || contador2==0 || contador2==9 || contador1==contador2 || (contador1+contador2==9)) {
                    System.out.print(contador1+""+contador2+" ");
                }else{
                    System.out.print("   ");                    
                }
            }
            System.out.println("");
        }
    }
}

