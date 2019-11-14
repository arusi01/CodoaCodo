package consulta_general_jdbc;

import interfaces.DAOpersona;
import patron_DAO.DAOpersonaImpl;

public class TestPersona {

    public static void main(String[] args) {
        
//        // ***** Registrar
//        Persona per = new Persona();
//        per.setId(1);
//        per.setNombre("Pablo");
//        per.setApellido("Argento");
//    
//        DAOpersona dao = new DAOpersonaImpl();
//        dao.registrar(per);
        

//          // ****** LISTAR
//        DAOpersona dao = new DAOpersonaImpl();
//        for (Persona daol : dao.listar()) {
//            System.out.println("ID "+daol.getId()+" Nombre "+daol.getNombre()+" Apellido "+daol.getApellido());   
//        }

//        // ***** MODIFICAR
//        Persona per = new Persona();
//        per.setId(2);
//        per.setNombre("Karina");
//        per.setApellido("Gomez");
//    
//        DAOpersona dao = new DAOpersonaImpl();
//        dao.modificar(per);

        // ***** ELIMINAR
        Persona per = new Persona();
        per.setId(1);
    
        DAOpersona dao = new DAOpersonaImpl();
        dao.eliminar(per);

    }
    
}
