package AGO29_Aerosub;

public class Aerosub implements Acuatico,Aerea{

    @Override
    public void Emerger() {
        System.out.println("Emerger");
    }

    @Override
    public void Sumergir() {
        System.out.println("Sumergir");
    }

    @Override
    public void Despegar() {
        System.out.println("Despegar");
    }

    @Override
    public void Acuatizar() {
        System.out.println("Acuatizar");
    }    
}
