package JUN11_Operaciones_get_set;

public class Main {

    public static void main(String[] args) {
        Operaciones oper1 = new Operaciones();
        Operaciones oper2 = new Operaciones();

        oper1.setNro1(4);
        oper1.setNro2(5);

        oper2.setNro1(20);
        oper2.setNro2(6);

        System.out.println("Suma: " + oper1.suma());
        System.out.println("Resta: " + oper1.resta());
        System.out.println("Multiplicacion:" + oper1.multiplicacion());

        System.out.println("Suma: " + oper2.suma());
        System.out.println("Resta: " + oper2.resta());
        System.out.println("Multiplicacion:" + oper2.multiplicacion());
    }

}
