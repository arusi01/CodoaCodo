package cfp10;

public class UN06_EJ16_Matriz_3x3 {

    public static void main(String[] args) {

        int Fila = 3;
        int Columna = 3;
        int nro = 9;

        int matriz[][] = new int[Fila][Columna];

        for (int f = 0; f < Fila; f++) {
            for (int c = 0; c < Columna; c++) {
                matriz[f][c] = (int) Math.floor((Math.random() * (nro + 1)));
            }
        }

        for (int f = 0; f < Fila; f++) {
            for (int c = 0; c < Columna; c++) {
                System.out.println("Valor Fila " + (f + 1) + " Columna " + (c + 1) + ": " + matriz[f][c]);
            }
        }
    }
}
