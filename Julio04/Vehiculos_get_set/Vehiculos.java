package JUN04_Vehiculos_get_set;

public class Vehiculos {

    private String Fabricante;
    private String matricula;
    private int Añofab;
    private float Velmax;

    public String getFabricante() {
        return Fabricante;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getAñofab() {
        return Añofab;
    }

    public float getVelmax() {
        return Velmax;
    }

    public void setFabricante(String Fabricante) {
        this.Fabricante = Fabricante;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setAñofab(int Añofab) {
        this.Añofab = Añofab;
    }

    public void setVelmax(float Velmax) {
        this.Velmax = Velmax;
    }

    public void arrancar() {
        System.out.println("\nARRANCAR");
        System.out.println("vehiculo: "+Fabricante+" matricula "+matricula+" modelo "+Añofab); 
    }

    public void acelerar(float velocidad, float tiempo) {
        System.out.println("\nACELERAR:");
        float distancia=velocidad*tiempo;
        System.out.println("Disctancia recorrida a "+velocidad+" km/h en "+tiempo+"H = "+distancia+" KM");
        System.out.println("Velocidad maxima del vehiculo: "+Velmax);                
    }

    public void frenar() {
        System.out.println("\nFRENAR:");
        System.out.println("Velocidad actual 0");     
    }

    public void apagar() {
        System.out.println("\nAPAGAR:");
        System.out.println("Vehiculo Apagado");     
    }

}
