
package Punto2;


import java.util.Date;

public class Notificacion {
    private String mensaje;
    private Date fecha;

    public Notificacion(String mensaje, Date fecha) {
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
