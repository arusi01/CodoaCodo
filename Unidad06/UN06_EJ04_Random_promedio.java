package cfp10;

public class UN06_EJ04_Random_promedio {

    public static void main(String[] args) {

        int largo = 10;
        int nro = 100;
        int acumulador=0;
        double promedio=0;
        int vector[] = new int[largo];

        System.out.println("Array al azar con un tamaño de "+largo);
        System.out.println("");

        for (int posicion = 0; posicion < vector.length; posicion++) {
            vector[posicion] = (int) Math.floor((Math.random() * (nro + 1)));
        }

        for (int posicion = 0; posicion < vector.length; posicion++) {
            acumulador=acumulador+vector[posicion];
        }
        promedio=(double) acumulador/vector.length;
        
//        for (int posicion=0; posicion < vector.length; posicion++) {
//        System.out.println("Nº"+(posicion+1)+" ingresado: "+vector[posicion]);
//        }
        
        System.out.println("\nEl promedio es: "+promedio);
    }
}
