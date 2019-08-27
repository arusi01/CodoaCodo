package AGO27_Cartas;

public class Main {

    enum Cartas {
        diamantes, corazones, espadas, flores;
    }

    public static void main(String[] args) {

        System.out.println("Todas los valores: ");
        for (Cartas crds : Cartas.values()) {
            System.out.println(""+crds);
        }
    }
}

