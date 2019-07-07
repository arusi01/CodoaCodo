package cfp10;

public class UN06_EJ18_Butacas_Cine {

    public static void llenarSala(boolean matriz[][]) {
               
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {
                matriz[f][c] = (Math.random() < 0.5);
            }
        }

    }

    public static void mostrarSala(boolean matriz[][]) {
        
        System.out.println("Sala de Cine:");

        for (int f = 0; f < matriz.length; f++) {
            System.out.printf("\nF%2d | ", (f+1));
            for (int c = 0; c < matriz[0].length; c++) {
                if (matriz[f][c]){
                    System.out.print("** | ");
                }else{
                    System.out.print("   | ");                    
                }
            }
        }

    }
    
    public static void contarSala(boolean matriz[][]) {
        int ocupado=0;
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {
                if (matriz[f][c]){
                    ocupado++;
                }
            }
        }
        System.out.println("\n\nTotal de Asientos ocupados: "+ocupado);
    }

    public static void main(String[] args) {

        int Fila = 10;
        int Columna = 10;

        boolean matriz[][] = new boolean[Fila][Columna];

        llenarSala(matriz);
        mostrarSala(matriz);
        contarSala(matriz);
    }
}
