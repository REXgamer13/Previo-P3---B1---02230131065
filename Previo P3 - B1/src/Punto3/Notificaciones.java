package Punto3;


import java.util.Date;

public class Notificaciones {
    private String mensaje;
    private Date fecha;

    public Notificaciones(String mensaje, Date fecha) {
        this.mensaje = mensaje;
        this.fecha = fecha;
    }

    public String getMensaje() {
        return mensaje;
    }

    public Date getFecha() {
        return fecha;
    }


}
