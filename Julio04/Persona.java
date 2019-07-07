package cfp10.poo;

public class Persona {
    
//    public String nombre = "Roberto";  /// modificador publico
//    public int edad=32;       /// Atributos
//    public char sexo='m';
//    public int dni=23232345;
    
    public String nombre;
    public int edad;
    public char sexo;
    public int dni;
    
    public void mostrar() {
        System.out.println("Mi nombre es: "+nombre+" y mi edad es: "+edad
                           +" y tengo sexo: "+sexo+" con dni: "+dni);
    }
    
    public void saludo() {
        System.out.println("Hola mundo java poo!!!!!");
    }
    
    public void comer() {
        System.out.println("Estoy comiendo pizza!!!!!");
    }
}
