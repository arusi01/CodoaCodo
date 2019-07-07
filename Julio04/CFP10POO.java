package cfp10.poo;

public class CFP10POO {

    public static void main(String[] args) {

        Persona dani = new Persona();

        dani.nombre="dani";   /// Objeto dani
        dani.edad=32;
        dani.sexo='m';
        dani.dni=23232323;
        
        dani.saludo();
        dani.comer();
        dani.mostrar();
        
        Persona roberto = new Persona();
        
        roberto.nombre="roberto";
        roberto.edad=23;
        roberto.sexo='m';
        roberto.dni=1367463478;
        
        roberto.saludo();
        roberto.mostrar();
        
    }
}
