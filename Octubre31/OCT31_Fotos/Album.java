package OCT31_Fotos;

import java.util.Date;
import java.util.List;

public class Album {
    private List<Foto> fotos;
    private String nombre;
    private int cantidadMaxima;
    private Date fechaCreacion;

    public Album(String nombre, int maximo) {
        this.nombre = nombre;
        this.cantidadMaxima = maximo;
    }

    public List<Foto> getFoto(int posicion) {
        fotos.get(posicion);
        return fotos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

}

