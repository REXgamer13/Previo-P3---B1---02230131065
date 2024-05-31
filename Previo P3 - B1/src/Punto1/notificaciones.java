package Punto1;

import java.util.Date;

public class notificaciones {
    private String mensaje;
    private Date fecha;

    public notificaciones(String mensaje, Date fecha) {
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


