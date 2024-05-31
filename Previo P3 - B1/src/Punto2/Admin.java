
package Punto2;

import java.util.List;
import java.util.ArrayList;

public class Admin {
    private String nombre;
    private String email;
    private List<Notificacion> notificaciones;

    public Admin(String nombre, String email) {
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

    public void addNotificacion(Notificacion notificacion) {
        this.notificaciones.add(notificacion);
    }

    public List<Notificacion> getNotificaciones() {
        return notificaciones;
    }

    public void generarInforme() {
       
    }

}
