package UN01_EJ06_Gato;

public class Gato {

    private String nombre;
    private String raza;
    private String color;

    public Gato(String nombre, String raza, String color) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
    }

    public void maullar() {
        System.out.println("Maullar: "+nombre+" "+raza+" "+color);
    }

    public void caminar() {
        System.out.println("Caminar: "+nombre+" "+raza+" "+color);
    }

    public void saltar() {
        System.out.println("Saltar: "+nombre+" "+raza+" "+color);
    }

    public void jugar() {
        System.out.println("Jugar: "+nombre+" "+raza+" "+color);
    }

}
