package Punto1;

import java.util.Date;

public class regsitro {
    private vehiculo vehiculo;
    private String conductor;
    private Date fechaInicio;
    private Date fechaFin;
    private String destino;
    private int kilometraje;

    public regsitro(vehiculo vehiculo, String conductor, Date fechaInicio, Date fechaFin, String destino, int kilometraje) {
        this.vehiculo = vehiculo;
        this.conductor = conductor;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.destino = destino;
        this.kilometraje = kilometraje;
    }

    public vehiculo getVehiculo() {
        return vehiculo;
    }

    public String getConductor() {
        return conductor;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public String getDestino() {
        return destino;
    }

    public int getKilometraje() {
        return kilometraje;
    }

}
