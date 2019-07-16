package JUN16_Profe_Estud_2;

public class Profesor extends Persona {

    private int cursos;

    public Profesor() {

    }

    public int getCursos() {
        return cursos;
    }

    public void setCursos(int cursos) {
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return "Profesor " + "cursos=" + cursos + " "+super.toString();
    }

    
}