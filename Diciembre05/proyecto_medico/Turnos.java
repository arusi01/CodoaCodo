package proyecto_medico;

import java.util.Date;

public class Turnos {

    private int id;
    private int numero;
    private Date fecha;
    private Paciente paciente;
    private Medicos medico;

    public Turnos(int id, int numero, Date fecha, Paciente paciente, Medicos medico) {
        this.id = id;
        this.numero = numero;
        this.fecha = fecha;
        this.paciente = paciente;
        this.medico = medico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medicos getMedico() {
        return medico;
    }

    public void setMedico(Medicos medico) {
        this.medico = medico;
    }

    @Override
    public String toString() {
        return "Turnos{" + "id=" + id + ", numero=" + numero + ", fecha=" + fecha + ", paciente=" + paciente.getNombre() + ", medico=" + medico.getApellido() + '}';
    }
    
    
    
}
