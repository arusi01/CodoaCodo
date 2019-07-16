package JUN16_Profe_Estud_2;

public class Estudiante extends Persona {

    private int legajo;

    public Estudiante() {
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return "Estudiante " + "legajo=" + legajo + " " + super.toString();
    }

}
