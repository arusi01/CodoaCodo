package proyecto_medico;

import java.util.Date;

public class TestMedico {

    public static void main(String[] args) {
        // TODO code application logic here
        Especialidad esp1 = new Especialidad(1,"Clinica Medica");
        Especialidad esp2 = new Especialidad(2,"Pediatra");
        
        Medicos med1 = new Medicos(1,"Juan","Perez",esp1);
        Medicos med2 = new Medicos(2,"Analia","Gomez",esp2);

        Paciente pac1 = new Paciente(1,"Pablo","Garcia","22000000");
        Paciente pac2 = new Paciente(2,"Claudia","Jazmin","33000000");

        Date fechaTurno = new Date(118,4,18);
        Turnos tur1 = new Turnos(1,1,fechaTurno,pac1,med1);        
    }
    
}
