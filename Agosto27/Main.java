package AGO27_Volar;

public class Main {

    public static void volador(Volar desp) {
        desp.despegar();
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Volar vol = new Avion();
        volador(vol); //Metodo

        vol = new Pajaro();
        volador(vol); //Metodo

        Volar despegue[] = new Volar[2];
        despegue[0] = new Avion();
        despegue[1] = new Pajaro();

        for (Volar volar : despegue) {
            volar.despegar();
        }

    }

}
