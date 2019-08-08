package AGO08_ArrayObjeto2;

public class Main {

    public static void main(String[] args) {

        Persona per1 = new Persona("pepito", "juarez", 23);
        Persona per2 = new Persona("paco", "perez", 33);
        Persona per3 = new Persona("david", "licona", 34);

        Persona persona[] = new Persona[3];
        persona[0] = per1;
        persona[1] = per2;
        persona[2] = per3;

        for (int i = 0; i < persona.length; i++) {
            Persona persona1 = persona[i];
            System.out.println("" + persona1.toString());

        }
    }

}
