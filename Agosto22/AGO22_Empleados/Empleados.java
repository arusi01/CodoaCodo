package AGO22_Empleados;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Empleados implements Iterable {

    private List<Empleado> emps = null;

    public Empleados() { //CONTRUCTOR
        emps = new ArrayList<>();

        Empleado empleado1 = new Empleado(1001, "Rams", "Lead", 2500);
        Empleado empleado2 = new Empleado(1002, "Posa", "Dev", 15000);
        Empleado empleado3 = new Empleado(1003, "Chinni", "QA", 1500);
        emps.add(empleado1);
        emps.add(empleado2);
        emps.add(empleado3);
    }

    public Iterator<Empleado> iterator() {
        return emps.iterator();
    }

}
