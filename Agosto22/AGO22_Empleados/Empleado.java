package AGO22_Empleados;

public class Empleado {

    //Atributos
    private int emp_id;
    private String emp_nombre;
    private String designacion;
    private double salario;

    public Empleado(int emp_id, String emp_nombre, String designacion, double salario) {
        this.emp_id = emp_id;
        this.emp_nombre = emp_nombre;
        this.designacion = designacion;
        this.salario = salario;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_nombre() {
        return emp_nombre;
    }

    public void setEmp_nombre(String emp_nombre) {
        this.emp_nombre = emp_nombre;
    }

    public String getDesignacion() {
        return designacion;
    }

    public void setDesignacion(String designacion) {
        this.designacion = designacion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String toString() {
        return "Empleado{" + "emp_id=" + emp_id + ", emp_nombre=" + emp_nombre + ", designacion=" + designacion + ", salario=" + salario + '}';
    }

    
}
