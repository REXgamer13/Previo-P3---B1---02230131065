package Punto1;

import java.util.Date;

public class Mantenimiento {
    private String tipo;
    private Date fecha;
    private int kilometraje;
    private String descripcion;

    public Mantenimiento(String tipo, Date fecha, int kilometraje, String descripcion) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.kilometraje = kilometraje;
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public String getDescripcion() {
        return descripcion;
    }


}
