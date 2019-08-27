package AGO27_Transporte;

public class Main {

    enum Transporte {
        COCHE, CAMION, AVION, TREN, BARCO;
    }

    public static void main(String[] args) {

        Transporte tp;
        tp = Transporte.AVION;

        if (tp == Transporte.AVION) {
            System.out.println(tp + " Tiene el valor de AVION");
        }

        switch (tp) {
            case COCHE:
                System.out.println(tp + " Tiene el valor de COCHE");
                break;
            case CAMION:
                System.out.println(tp + " Tiene el valor de CAMION");
                break;
            case AVION:
                System.out.println(tp + " Tiene el valor de AVION");
                break;
            case TREN:
                System.out.println(tp + " Tiene el valor de TREN");
                break;
            case BARCO:
                System.out.println(tp + " Tiene el valor de BRACO");
                break;
        }
    }

}
