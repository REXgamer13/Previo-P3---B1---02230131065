
package Punto3;


import java.util.List;
import java.util.ArrayList;

public class Administrador {
    private String nombre;
    private String email;
    private List<Notificaciones> notificaciones;

    public Administrador(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        this.notificaciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public void addNotificacion(Notificaciones notificacion) {
        this.notificaciones.add(notificacion);
    }

    public List<Notificaciones> getNotificaciones() {
        return notificaciones;
    }

    public void gestionarDisponibilidadMedicos() {

    }

    public void gestionarSalasDeConsulta() {

    }

}
