package JUN11_Operaciones_get_set;

public class Operaciones {

    private int nro1;
    private int nro2;

    public void setNro1(int nro1) {
        this.nro1 = nro1;
    }

    public void setNro2(int nro2) {
        this.nro2 = nro2;
    }

    public int getNro1() {
        return nro1;
    }

    public int getNro2() {
        return nro2;
    }

    public int suma() {
        int resultado = nro1 + nro2;
        return (resultado);
    }

    public int resta() {
        int resultado = nro1 - nro2;
        return (resultado);
    }

    public int multiplicacion() {
        int resultado = nro1 * nro2;
        return (resultado);
    }
}
