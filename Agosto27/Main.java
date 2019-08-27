package AGO27_Abstraccion;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Alumno per = new Alumno(178, "Pepe", 23);
        Profesor pr = new Profesor("Programacion", "Matias", 25);

        System.out.println("Alumno Leago:" + per.getLegajo()
                + " Nombre " + per.getNombre()
                + " Edad: " + per.getEdad());
        System.out.println("Profesor Materia: " + pr.getMateria()
                + " Nombre " + pr.getNombre()
                + " Edad " + pr.getEdad());
    }

}
