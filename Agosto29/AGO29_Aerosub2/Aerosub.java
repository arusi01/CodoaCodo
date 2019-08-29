package AGO29_Aerosub2;

public class Aerosub extends Acuatico implements Aerea{

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
