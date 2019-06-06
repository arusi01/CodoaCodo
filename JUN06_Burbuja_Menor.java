package cfp10;

public class JUN06_Burbuja_Menor {

    public static void main(String[] args) {

        int vector[] = {6, 4, 5, 8, 7, 20, 2};
        int aux = 0;

        for (int pasada = 0; pasada < vector.length - 1; pasada++) {
            for (int posicion = pasada; posicion < vector.length - 1; posicion++) {
                for (int posicion2 = 0; posicion2 < vector.length - posicion - 1; posicion2++) {
                    if (vector[posicion2] < vector[posicion2 + 1]) {
                        aux = vector[posicion2];
                        vector[posicion2] = vector[posicion2 + 1];
                        vector[posicion2 + 1] = aux;
                    }
                }
            }
        }

        for (int posicion = 0; posicion < vector.length; posicion++) {
            System.out.println("Nro [" + posicion + "]: " + vector[posicion]);
        }

    }
}
